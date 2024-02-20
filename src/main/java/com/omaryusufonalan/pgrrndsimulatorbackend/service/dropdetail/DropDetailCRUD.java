package com.omaryusufonalan.pgrrndsimulatorbackend.service.dropdetail;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.DropDetail;

public interface DropDetailCRUD {
    DropDetail getById(Long id);
    DropDetailResponse create(DropDetailRequest dropDetailRequest);
    DropDetailResponse update(Long id, DropDetailRequest dropDetailRequest);
    void delete(Long id);
}
