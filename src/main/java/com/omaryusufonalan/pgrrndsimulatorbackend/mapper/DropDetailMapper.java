package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailWithoutBannerResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.DropDetail;
import org.mapstruct.MappingTarget;

import java.util.Set;

public interface DropDetailMapper {
    DropDetail asDropDetail(DropDetailRequest dropDetailRequest);

    DropDetailResponse asDropDetailResponse(DropDetail dropDetail);

    Set<DropDetailResponse> asDropDetailResponses(Set<DropDetail> dropDetail);

    void update(@MappingTarget DropDetail entity, DropDetailRequest dropDetailRequest);

    DropDetailWithoutBannerResponse asDropDetailWithoutBannerResponse(DropDetail dropDetail);
}
