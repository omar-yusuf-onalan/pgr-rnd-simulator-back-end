package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemorySaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Construct;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Item;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Memory;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface SupplyMapper {
    Construct asConstruct(ConstructSaveRequest constructRequest);
    ConstructResponse asConstructResponse(Construct construct);
    void update(@MappingTarget Construct construct, ConstructSaveRequest constructRequest);

    Memory asMemory(MemorySaveRequest memoryRequest);
    MemoryResponse asMemoryResponse(Memory memory);
    void update(@MappingTarget Memory memory, MemorySaveRequest memoryRequest);

    Item asItem(ItemSaveRequest itemRequest);
    ItemResponse asItemResponse(Item item);
    void update(@MappingTarget Item item, ItemSaveRequest itemRequest);
}
