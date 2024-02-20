package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Construct;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Item;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Memory;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface SupplyMapper {
    Construct asConstruct(ConstructRequest constructRequest);
    ConstructResponse asConstructResponse(Construct construct);
    void update(@MappingTarget Construct construct, ConstructRequest constructRequest);

    Memory asMemory(MemoryRequest memoryRequest);
    MemoryResponse asMemoryResponse(Memory memory);
    void update(@MappingTarget Memory memory, MemoryRequest memoryRequest);

    Item asItem(ItemRequest itemRequest);
    ItemResponse asItemResponse(Item item);
    void update(@MappingTarget Item item, ItemRequest itemRequest);
}
