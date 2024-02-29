package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Banner;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface BannerMapper {
    Banner asBanner(BannerSaveRequest bannerSaveRequest);

    BannerResponse asBannerResponse(Banner banner);

    void update(@MappingTarget Banner banner, BannerSaveRequest bannerSaveRequest);
}
