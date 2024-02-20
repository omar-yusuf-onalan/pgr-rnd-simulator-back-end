package com.omaryusufonalan.pgrrndsimulatorbackend.repository;

import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyRepository extends JpaRepository<Supply, Long> {
}
