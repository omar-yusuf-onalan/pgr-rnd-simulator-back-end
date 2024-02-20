package com.omaryusufonalan.pgrrndsimulatorbackend.dto.user;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencyWithoutUserResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory.InventoryWithoutUserResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.Role;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserResponse {
    private Long id;

    private String username;

    private Role role;

    private Set<CurrencyWithoutUserResponse> currencies;

    private InventoryWithoutUserResponse inventory;
}
