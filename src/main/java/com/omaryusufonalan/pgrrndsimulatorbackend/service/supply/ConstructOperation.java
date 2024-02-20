package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructResponse;

public interface ConstructOperation {
    ConstructResponse getConstructResponseById(Long id);
    ConstructResponse create(ConstructRequest constructRequest);
    ConstructResponse update(Long id, ConstructRequest constructRequest);
}
