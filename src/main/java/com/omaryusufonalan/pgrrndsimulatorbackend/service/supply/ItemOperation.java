package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemResponse;

public interface ItemOperation {
    ItemResponse getItemResponseById(Long id);
    ItemResponse create(ItemSaveRequest itemRequest);
    ItemResponse update(Long id, ItemSaveRequest itemRequest);
}
