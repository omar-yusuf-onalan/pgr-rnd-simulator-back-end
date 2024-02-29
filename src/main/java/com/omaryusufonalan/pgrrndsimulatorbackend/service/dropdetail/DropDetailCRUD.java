package com.omaryusufonalan.pgrrndsimulatorbackend.service.dropdetail;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.DropDetail;

public interface DropDetailCRUD {
    DropDetail getById(Long id);
    DropDetailResponse create(DropDetailSaveRequest dropDetailSaveRequest);
    DropDetailResponse update(Long id, DropDetailSaveRequest dropDetailSaveRequest);
    void delete(Long id);
}
