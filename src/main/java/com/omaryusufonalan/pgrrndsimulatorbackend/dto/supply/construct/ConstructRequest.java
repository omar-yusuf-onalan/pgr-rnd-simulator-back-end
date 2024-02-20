package com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.SupplyRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ConstructType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ConstructRequest extends SupplyRequest {
    private String model;

    private String element;

    private boolean onEvent;

    private ConstructType constructType;
}
