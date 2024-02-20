package com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserWithoutAnythingResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CurrencyResponse {
    private Long id;

    private int amount;

    private CurrencyType type;

    private UserWithoutAnythingResponse user;
}
