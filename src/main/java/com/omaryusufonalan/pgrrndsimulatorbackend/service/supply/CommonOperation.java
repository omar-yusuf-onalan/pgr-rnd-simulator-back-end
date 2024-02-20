package com.omaryusufonalan.pgrrndsimulatorbackend.service.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply.Supply;

public interface CommonOperation {
    Supply getById(Long id);
    void delete(Long id);
}
