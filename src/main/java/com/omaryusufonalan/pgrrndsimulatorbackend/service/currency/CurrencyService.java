package com.omaryusufonalan.pgrrndsimulatorbackend.service.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Currency;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.CurrencyMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.CurrencyRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyService implements CurrencyCRUD {
    private final CurrencyRepository currencyRepository;
    private final CurrencyMapper currencyMapper;

    @Override
    public Currency getById(Long id) {
        return currencyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Currency with ID " + id + " not found"));
    }

    @Override
    public CurrencyResponse create(CurrencyRequest currencyRequest) {
        Currency currencyToBeCreated = currencyMapper.asCurrency(currencyRequest);

        return currencyMapper.asCurrencyResponse(currencyRepository.save(currencyToBeCreated));
    }

    @Override
    public CurrencyResponse update(Long id, CurrencyRequest currencyRequest) {
        Currency currencyToBeUpdated = getById(id);

        currencyMapper.update(currencyToBeUpdated, currencyRequest);

        return currencyMapper.asCurrencyResponse(currencyRepository.save(currencyToBeUpdated));
    }

    @Override
    public void delete(Long id) {
        currencyRepository.delete(getById(id));
    }
}
