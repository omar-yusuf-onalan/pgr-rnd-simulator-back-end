package com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CurrencySaveRequest {
    @PositiveOrZero
    private int amount;

    private CurrencyType type;

    private UserUpdateRequest user;
}
