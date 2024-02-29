package com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.SupplyUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ItemType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ItemUpdateRequest extends SupplyUpdateRequest {
    private ItemType itemType;
}
