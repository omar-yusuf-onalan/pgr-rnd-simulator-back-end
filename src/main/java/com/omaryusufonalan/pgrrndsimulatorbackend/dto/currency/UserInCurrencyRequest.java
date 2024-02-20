package com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserInCurrencyRequest {
    @PositiveOrZero
    private Long id;

    @NotBlank(message = "Username cannot be blank")
    private String username;

    private Role role;
}
