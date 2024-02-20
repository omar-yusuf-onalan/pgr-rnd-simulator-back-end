package com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.SupplyWithoutInventoryResponse;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class InventoryWithoutUserResponse {
    private List<SupplyWithoutInventoryResponse> supplies;
}
