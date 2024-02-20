package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyWithoutUserResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Currency;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.Set;

@Mapper
public interface CurrencyMapper {
    Currency asCurrency(CurrencyRequest currencyRequest);

    CurrencyResponse asCurrencyResponse(Currency currency);

    Set<CurrencyResponse> asCurrencyResponses(Set<Currency> currency);

    void update(@MappingTarget Currency entity, CurrencyRequest currencyRequest);

    CurrencyWithoutUserResponse asCurrencyWithoutUserResponse(Currency currency);
}
