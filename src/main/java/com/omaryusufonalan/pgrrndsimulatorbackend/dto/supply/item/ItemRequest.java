package com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.SupplyRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ItemType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ItemRequest extends SupplyRequest {
    private ItemType itemType;
}
