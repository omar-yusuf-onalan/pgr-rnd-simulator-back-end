package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemorySaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Construct;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Item;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Memory;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Supply;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.SupplyMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.SupplyRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplyService implements CommonOperation, ConstructOperation, MemoryOperation, ItemOperation {
    private final SupplyRepository supplyRepository;
    private final SupplyMapper supplyMapper;

    @Override
    public Supply getById(Long id) {
        return supplyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Supply with ID " + id + " not found"));
    }

    @Override
    public void delete(Long id) {
        supplyRepository.delete(getById(id));
    }

    @Override
    public ConstructResponse getConstructResponseById(Long id) {
        return supplyMapper.asConstructResponse((Construct) getById(id));
    }

    @Override
    public ConstructResponse create(ConstructSaveRequest constructRequest) {
        Construct constructToBeCreated = supplyMapper.asConstruct(constructRequest);

        return supplyMapper.asConstructResponse(supplyRepository.save(constructToBeCreated));
    }

    @Override
    public ConstructResponse update(Long id, ConstructUpdateRequest constructUpdateRequest) {
        Construct constructToBeUpdated = (Construct) getById(id);

        supplyMapper.update(constructToBeUpdated, constructUpdateRequest);

        return supplyMapper.asConstructResponse(supplyRepository.save(constructToBeUpdated));
    }

    @Override
    public MemoryResponse getMemoryResponseById(Long id) {
        return supplyMapper.asMemoryResponse((Memory) getById(id));
    }

    @Override
    public MemoryResponse create(MemorySaveRequest memoryRequest) {
        Memory memoryToBeCreated = supplyMapper.asMemory(memoryRequest);

        return supplyMapper.asMemoryResponse(supplyRepository.save(memoryToBeCreated));
    }

    @Override
    public MemoryResponse update(Long id, MemoryUpdateRequest memoryUpdateRequest) {
        Memory memoryToBeUpdated = (Memory) getById(id);

        supplyMapper.update(memoryToBeUpdated, memoryUpdateRequest);

        return supplyMapper.asMemoryResponse(supplyRepository.save(memoryToBeUpdated));
    }

    @Override
    public ItemResponse getItemResponseById(Long id) {
        return supplyMapper.asItemResponse((Item) getById(id));
    }

    @Override
    public ItemResponse create(ItemSaveRequest itemRequest) {
        Item itemToBeCreated = supplyMapper.asItem(itemRequest);

        return supplyMapper.asItemResponse(supplyRepository.save(itemToBeCreated));
    }

    @Override
    public ItemResponse update(Long id, ItemUpdateRequest itemUpdateRequest) {
        Item itemToBeUpdated = (Item) getById(id);

        supplyMapper.update(itemToBeUpdated, itemUpdateRequest);

        return supplyMapper.asItemResponse(supplyRepository.save(itemToBeUpdated));
    }
}
