package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryResponse;

public interface MemoryOperation {
    MemoryResponse getMemoryResponseById(Long id);
    MemoryResponse create(MemoryRequest memoryRequest);
    MemoryResponse update(Long id, MemoryRequest memoryRequest);
}
