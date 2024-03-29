package com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.OnlySupplyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.OnlyUserResponse;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class InventoryResponse {
    private List<OnlySupplyResponse> supplies;

    private OnlyUserResponse user;
}
