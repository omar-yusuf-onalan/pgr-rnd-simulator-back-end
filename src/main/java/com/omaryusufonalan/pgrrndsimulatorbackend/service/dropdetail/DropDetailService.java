package com.omaryusufonalan.pgrrndsimulatorbackend.service.dropdetail;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.DropDetail;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.DropDetailMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.DropDetailRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DropDetailService implements DropDetailCRUD {
    private final DropDetailRepository dropDetailRepository;
    private final DropDetailMapper dropDetailMapper;

    @Override
    public DropDetail getById(Long id) {
        return dropDetailRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("DropDetail with ID " + id + " not found"));
    }

    @Override
    public DropDetailResponse create(DropDetailRequest dropDetailRequest) {
        DropDetail dropDetailToBeCreated = dropDetailMapper.asDropDetail(dropDetailRequest);

        return dropDetailMapper.asDropDetailResponse(dropDetailRepository.save(dropDetailToBeCreated));
    }

    @Override
    public DropDetailResponse update(Long id, DropDetailRequest dropDetailRequest) {
        DropDetail dropDetailToBeUpdated = getById(id);

        dropDetailMapper.update(dropDetailToBeUpdated, dropDetailRequest);

        return dropDetailMapper.asDropDetailResponse(dropDetailRepository.save(dropDetailToBeUpdated));
    }

    @Override
    public void delete(Long id) {
        dropDetailRepository.delete(getById(id));
    }
}
