package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.supply.construct.ConstructResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Construct;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Supply;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.SupplyMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.SupplyRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplyService implements CommonOperation, ConstructOperation {
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
}
