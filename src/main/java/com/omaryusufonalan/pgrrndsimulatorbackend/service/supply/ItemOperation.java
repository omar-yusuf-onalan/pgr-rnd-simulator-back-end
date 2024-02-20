package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemResponse;

public interface ItemOperation {
    ItemResponse getItemResponseById(Long id);
    ItemResponse create(ItemRequest itemRequest);
    ItemResponse update(Long id, ItemRequest itemRequest);
}
