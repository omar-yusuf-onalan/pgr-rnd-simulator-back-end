package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.DropDetailUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.OnlyDropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.DropDetail;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.Set;

@Mapper
public interface DropDetailMapper {
    DropDetail asDropDetail(DropDetailSaveRequest dropDetailSaveRequest);

    DropDetailResponse asDropDetailResponse(DropDetail dropDetail);

    Set<DropDetailResponse> asDropDetailResponses(Set<DropDetail> dropDetail);

    void update(@MappingTarget DropDetail entity, DropDetailUpdateRequest dropDetailUpdateRequest);

    OnlyDropDetailResponse asDropDetailWithoutBannerResponse(DropDetail dropDetail);
}
