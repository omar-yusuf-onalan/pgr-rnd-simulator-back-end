package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory.InventoryResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory.InventorySaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory.InventoryUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory.OnlyInventoryResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface InventoryMapper {
    Inventory asInventory(InventorySaveRequest inventorySaveRequest);

    InventoryResponse asInventoryResponse(Inventory inventory);

    void update(@MappingTarget Inventory entity, InventoryUpdateRequest inventoryUpdateRequest);

    OnlyInventoryResponse asInventoryWithoutUserResponse(Inventory inventory);
}
