package com.omaryusufonalan.pgrrndsimulatorbackend.service.dropdetail;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.OnlyDropDetailResponse;

public interface GetDropDetailDTO {
    DropDetailResponse getResponseById(Long id);
    OnlyDropDetailResponse getWithoutBannerResponseById(Long id);
}
