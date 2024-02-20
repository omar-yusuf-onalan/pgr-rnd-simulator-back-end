package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Banner;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface BannerMapper {
    Banner asBanner(BannerRequest bannerRequest);

    BannerResponse asBannerResponse(Banner banner);

    void update(@MappingTarget Banner banner, BannerRequest bannerRequest);
}
