package com.omaryusufonalan.pgrrndsimulatorbackend.repository;

import com.omaryusufonalan.pgrrndsimulatorbackend.entity.DropDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DropDetailRepository extends JpaRepository<DropDetail, Long> {
}
