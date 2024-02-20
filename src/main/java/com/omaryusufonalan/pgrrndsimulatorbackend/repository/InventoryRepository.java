package com.omaryusufonalan.pgrrndsimulatorbackend.repository;

import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
