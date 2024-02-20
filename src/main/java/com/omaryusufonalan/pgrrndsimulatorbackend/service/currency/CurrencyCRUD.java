package com.omaryusufonalan.pgrrndsimulatorbackend.service.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Currency;

public interface CurrencyCRUD {
    Currency getById(Long id);
    CurrencyResponse create(CurrencyRequest currencyRequest);
    CurrencyResponse update(Long id, CurrencyRequest currencyRequest);
    void delete(Long id);
}
