package com.omaryusufonalan.pgrrndsimulatorbackend.service.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyWithoutUserResponse;

public interface GetCurrencyDTO {
    CurrencyResponse getResponseById(Long id);
    CurrencyWithoutUserResponse getWithoutUserResponseById(Long id);
}
