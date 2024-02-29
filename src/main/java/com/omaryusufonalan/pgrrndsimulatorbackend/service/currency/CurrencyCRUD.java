package com.omaryusufonalan.pgrrndsimulatorbackend.service.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencySaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Currency;

public interface CurrencyCRUD {
    Currency getById(Long id);
    CurrencyResponse create(CurrencySaveRequest currencySaveRequest);
    CurrencyResponse update(Long id, CurrencySaveRequest currencySaveRequest);
    void delete(Long id);
}
