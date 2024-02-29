package com.omaryusufonalan.pgrrndsimulatorbackend.service.banner;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Banner;

public interface BannerCRUD {
    Banner getById(Long id);
    BannerResponse create(BannerSaveRequest bannerSaveRequest);
    BannerResponse update(Long id, BannerUpdateRequest bannerUpdateRequest);
    void delete(Long id);
}
