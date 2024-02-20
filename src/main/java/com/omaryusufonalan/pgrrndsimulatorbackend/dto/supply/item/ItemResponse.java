package com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.SupplyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ItemType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ItemResponse extends SupplyResponse {
    private ItemType itemType;
}
