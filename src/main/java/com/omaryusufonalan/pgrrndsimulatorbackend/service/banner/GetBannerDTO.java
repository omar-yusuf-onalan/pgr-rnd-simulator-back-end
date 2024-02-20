package com.omaryusufonalan.pgrrndsimulatorbackend.service.banner;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerResponse;

public interface GetBannerDTO {
    BannerResponse getResponseById(Long id);
}
