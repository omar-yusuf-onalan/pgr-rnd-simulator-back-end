package com.omaryusufonalan.pgrrndsimulatorbackend.service.banner;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.BannerResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Banner;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.BannerMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.BannerRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BannerService implements BannerCRUD {
    private final BannerRepository bannerRepository;
    private final BannerMapper bannerMapper;

    @Override
    public Banner getById(Long id) {
        return bannerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Banner with ID " + id + " not found"));
    }

    @Override
    public BannerResponse create(BannerRequest bannerRequest) {
        Banner bannerToBeCreated = bannerMapper.asBanner(bannerRequest);

        return bannerMapper.asBannerResponse(bannerRepository.save(bannerToBeCreated));
    }

    @Override
    public BannerResponse update(Long id, BannerRequest bannerRequest) {
        Banner bannerToBeUpdated = getById(id);

        bannerMapper.update(bannerToBeUpdated, bannerRequest);

        return bannerMapper.asBannerResponse(bannerRepository.save(bannerToBeUpdated));
    }

    @Override
    public void delete(Long id) {
        bannerRepository.delete(getById(id));
    }
}
