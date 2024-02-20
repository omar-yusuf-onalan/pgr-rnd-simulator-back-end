package com.omaryusufonalan.pgrrndsimulatorbackend.repository;

import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepository extends JpaRepository<Banner, Long> {
}
