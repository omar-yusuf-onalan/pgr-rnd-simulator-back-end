package com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.OnlySupplyResponse;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OnlyInventoryResponse {
    private List<OnlySupplyResponse> supplies;
}
