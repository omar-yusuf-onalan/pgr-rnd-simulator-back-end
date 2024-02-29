package com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OnlyCurrencyResponse {
    private Long id;

    private int amount;

    private CurrencyType type;
}
