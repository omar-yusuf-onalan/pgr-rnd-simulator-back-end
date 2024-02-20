package com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.SupplyResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ConstructType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ConstructResponse extends SupplyResponse {
    private String model;

    private String element;

    private boolean onEvent;

    private ConstructType constructType;
}
