package com.omaryusufonalan.pgrrndsimulatorbackend.service.dropdetail;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.OnlyDropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.DropDetail;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.DropDetailMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.DropDetailRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DropDetailService implements DropDetailCRUD, GetDropDetailDTO {
    private final DropDetailRepository dropDetailRepository;
    private final DropDetailMapper dropDetailMapper;

    @Override
    public DropDetail getById(Long id) {
        return dropDetailRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("DropDetail with ID " + id + " not found"));
    }

    @Override
    public DropDetailResponse create(DropDetailSaveRequest dropDetailSaveRequest) {
        DropDetail dropDetailToBeCreated = dropDetailMapper.asDropDetail(dropDetailSaveRequest);

        return dropDetailMapper.asDropDetailResponse(dropDetailRepository.save(dropDetailToBeCreated));
    }

    @Override
    public DropDetailResponse update(Long id, DropDetailSaveRequest dropDetailSaveRequest) {
        DropDetail dropDetailToBeUpdated = getById(id);

        dropDetailMapper.update(dropDetailToBeUpdated, dropDetailSaveRequest);

        return dropDetailMapper.asDropDetailResponse(dropDetailRepository.save(dropDetailToBeUpdated));
    }

    @Override
    public void delete(Long id) {
        dropDetailRepository.delete(getById(id));
    }

    @Override
    public DropDetailResponse getResponseById(Long id) {
        return dropDetailMapper.asDropDetailResponse(getById(id));
    }

    @Override
    public OnlyDropDetailResponse getWithoutBannerResponseById(Long id) {
        return dropDetailMapper.asDropDetailWithoutBannerResponse(getById(id));
    }
}
