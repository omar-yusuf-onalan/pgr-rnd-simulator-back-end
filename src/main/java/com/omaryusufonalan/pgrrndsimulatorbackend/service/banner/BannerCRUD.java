package com.omaryusufonalan.pgrrndsimulatorbackend.service.banner;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Banner;

public interface BannerCRUD {
    Banner getById(Long id);
    BannerResponse create(BannerRequest bannerRequest);
    BannerResponse update(Long id, BannerRequest bannerRequest);
    void delete(Long id);
}
