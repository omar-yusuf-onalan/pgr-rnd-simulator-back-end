package com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CurrencyRequest {
    @PositiveOrZero
    private int amount;

    private CurrencyType type;

    private UserInCurrencyRequest user;
}
