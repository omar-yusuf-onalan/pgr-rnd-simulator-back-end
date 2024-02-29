package com.omaryusufonalan.pgrrndsimulatorbackend.service.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencySaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.OnlyCurrencyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Currency;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.CurrencyMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.CurrencyRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyService implements CurrencyCRUD, GetCurrencyDTO {
    private final CurrencyRepository currencyRepository;
    private final CurrencyMapper currencyMapper;

    @Override
    public Currency getById(Long id) {
        return currencyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Currency with ID " + id + " not found"));
    }

    @Override
    public CurrencyResponse create(CurrencySaveRequest currencySaveRequest) {
        Currency currencyToBeCreated = currencyMapper.asCurrency(currencySaveRequest);

        return currencyMapper.asCurrencyResponse(currencyRepository.save(currencyToBeCreated));
    }

    @Override
    public CurrencyResponse update(Long id, CurrencyUpdateRequest currencyUpdateRequest) {
        Currency currencyToBeUpdated = getById(id);

        currencyMapper.update(currencyToBeUpdated, currencyUpdateRequest);

        return currencyMapper.asCurrencyResponse(currencyRepository.save(currencyToBeUpdated));
    }

    @Override
    public void delete(Long id) {
        currencyRepository.delete(getById(id));
    }

    @Override
    public CurrencyResponse getResponseById(Long id) {
        return currencyMapper.asCurrencyResponse(getById(id));
    }

    @Override
    public OnlyCurrencyResponse getWithoutUserResponseById(Long id) {
        return currencyMapper.asCurrencyWithoutUserResponse(getById(id));
    }
}
