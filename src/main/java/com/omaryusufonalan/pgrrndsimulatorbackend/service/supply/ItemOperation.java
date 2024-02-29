package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemUpdateRequest;

public interface ItemOperation {
    ItemResponse getItemResponseById(Long id);
    ItemResponse create(ItemSaveRequest itemRequest);
    ItemResponse update(Long id, ItemUpdateRequest itemUpdateRequest);
}
