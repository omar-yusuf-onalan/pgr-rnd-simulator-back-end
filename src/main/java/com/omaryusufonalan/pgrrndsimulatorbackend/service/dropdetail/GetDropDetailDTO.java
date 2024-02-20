package com.omaryusufonalan.pgrrndsimulatorbackend.service.dropdetail;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailWithoutBannerResponse;

public interface GetDropDetailDTO {
    DropDetailResponse getResponseById(Long id);
    DropDetailWithoutBannerResponse getWithoutBannerResponseById(Long id);
}
