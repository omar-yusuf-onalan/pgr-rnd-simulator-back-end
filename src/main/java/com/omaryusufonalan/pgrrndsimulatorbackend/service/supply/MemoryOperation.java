package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemorySaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryUpdateRequest;

public interface MemoryOperation {
    MemoryResponse getMemoryResponseById(Long id);
    MemoryResponse create(MemorySaveRequest memoryRequest);
    MemoryResponse update(Long id, MemoryUpdateRequest memoryUpdateRequest);
}
