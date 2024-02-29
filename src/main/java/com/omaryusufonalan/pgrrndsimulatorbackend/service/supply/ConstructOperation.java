package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructUpdateRequest;

public interface ConstructOperation {
    ConstructResponse getConstructResponseById(Long id);
    ConstructResponse create(ConstructSaveRequest constructRequest);
    ConstructResponse update(Long id, ConstructUpdateRequest constructUpdateRequest);
}
