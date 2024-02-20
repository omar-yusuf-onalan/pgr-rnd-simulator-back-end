package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.item.ItemResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.memory.MemoryResponse;
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
    public ConstructResponse create(ConstructRequest constructRequest) {
        Construct constructToBeCreated = supplyMapper.asConstruct(constructRequest);

        return supplyMapper.asConstructResponse(supplyRepository.save(constructToBeCreated));
    }

    @Override
    public ConstructResponse update(Long id, ConstructRequest constructRequest) {
        Construct constructToBeUpdated = (Construct) getById(id);

        supplyMapper.update(constructToBeUpdated, constructRequest);

        return supplyMapper.asConstructResponse(supplyRepository.save(constructToBeUpdated));
    }

    @Override
    public MemoryResponse getMemoryResponseById(Long id) {
        return supplyMapper.asMemoryResponse((Memory) getById(id));
    }

    @Override
    public MemoryResponse create(MemoryRequest memoryRequest) {
        Memory memoryToBeCreated = supplyMapper.asMemory(memoryRequest);

        return supplyMapper.asMemoryResponse(supplyRepository.save(memoryToBeCreated));
    }

    @Override
    public MemoryResponse update(Long id, MemoryRequest memoryRequest) {
        Memory memoryToBeUpdated = (Memory) getById(id);

        supplyMapper.update(memoryToBeUpdated, memoryRequest);

        return supplyMapper.asMemoryResponse(supplyRepository.save(memoryToBeUpdated));
    }

    @Override
    public ItemResponse getItemResponseById(Long id) {
        return supplyMapper.asItemResponse((Item) getById(id));
    }

    @Override
    public ItemResponse create(ItemRequest itemRequest) {
        Item itemToBeCreated = supplyMapper.asItem(itemRequest);

        return supplyMapper.asItemResponse(supplyRepository.save(itemToBeCreated));
    }

    @Override
    public ItemResponse update(Long id, ItemRequest itemRequest) {
        Item itemToBeUpdated = (Item) getById(id);

        supplyMapper.update(itemToBeUpdated, itemRequest);

        return supplyMapper.asItemResponse(supplyRepository.save(itemToBeUpdated));
    }
}
