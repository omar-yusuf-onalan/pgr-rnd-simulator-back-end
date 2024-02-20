package com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.SupplyWithoutInventoryResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserWithoutAnythingResponse;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class InventoryResponse {
    private List<SupplyWithoutInventoryResponse> supplies;

    private UserWithoutAnythingResponse user;
}
