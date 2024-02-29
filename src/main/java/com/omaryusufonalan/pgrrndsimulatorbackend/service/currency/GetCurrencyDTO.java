package com.omaryusufonalan.pgrrndsimulatorbackend.service.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.OnlyCurrencyResponse;

public interface GetCurrencyDTO {
    CurrencyResponse getResponseById(Long id);
    OnlyCurrencyResponse getWithoutUserResponseById(Long id);
}
