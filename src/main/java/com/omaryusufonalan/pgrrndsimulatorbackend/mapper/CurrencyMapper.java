package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencySaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.OnlyCurrencyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Currency;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.Set;

@Mapper
public interface CurrencyMapper {
    Currency asCurrency(CurrencySaveRequest currencySaveRequest);

    CurrencyResponse asCurrencyResponse(Currency currency);

    Set<CurrencyResponse> asCurrencyResponses(Set<Currency> currency);

    void update(@MappingTarget Currency entity, CurrencySaveRequest currencySaveRequest);

    OnlyCurrencyResponse asCurrencyWithoutUserResponse(Currency currency);
}
