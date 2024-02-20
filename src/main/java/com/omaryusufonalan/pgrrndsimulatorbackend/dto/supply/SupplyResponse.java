package com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.SupplyRarity;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.SupplyType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class SupplyResponse {
    private Long id;

    private String name;

    private SupplyRarity supplyRarity;

    private SupplyType supplyType;
}
