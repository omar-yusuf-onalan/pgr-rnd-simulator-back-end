package com.omaryusufonalan.pgrrndsimulatorbackend.service.banner;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Banner;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.BannerMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.BannerRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BannerService implements BannerCRUD, GetBannerDTO {
    private final BannerRepository bannerRepository;
    private final BannerMapper bannerMapper;

    @Override
    public Banner getById(Long id) {
        return bannerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Banner with ID " + id + " not found"));
    }

    @Override
    public BannerResponse create(BannerSaveRequest bannerSaveRequest) {
        Banner bannerToBeCreated = bannerMapper.asBanner(bannerSaveRequest);

        return bannerMapper.asBannerResponse(bannerRepository.save(bannerToBeCreated));
    }

    @Override
    public BannerResponse update(Long id, BannerSaveRequest bannerSaveRequest) {
        Banner bannerToBeUpdated = getById(id);

        bannerMapper.update(bannerToBeUpdated, bannerSaveRequest);

        return bannerMapper.asBannerResponse(bannerRepository.save(bannerToBeUpdated));
    }

    @Override
    public void delete(Long id) {
        bannerRepository.delete(getById(id));
    }

    @Override
    public BannerResponse getResponseById(Long id) {
        return bannerMapper.asBannerResponse(getById(id));
    }
}
