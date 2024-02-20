package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory.InventoryRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory.InventoryResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory.InventoryWithoutUserResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface InventoryMapper {
    Inventory asInventory(InventoryRequest inventoryRequest);

    InventoryResponse asInventoryResponse(Inventory inventory);

    void update(@MappingTarget Inventory entity, InventoryRequest inventoryRequest);

    InventoryWithoutUserResponse asInventoryWithoutUserResponse(Inventory inventory);
}
