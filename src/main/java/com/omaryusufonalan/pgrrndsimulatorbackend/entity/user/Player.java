package com.omaryusufonalan.pgrrndsimulatorbackend.entity.user;

import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Currency;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@DiscriminatorValue("PLAYER")
public class Player {
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "player", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<Currency> currencies;
}
