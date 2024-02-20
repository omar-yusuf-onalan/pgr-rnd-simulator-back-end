package com.omaryusufonalan.pgrrndsimulatorbackend.entity.supply;

import com.omaryusufonalan.pgrrndsimulatorbackend.entity.Inventory;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.SupplyRarity;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.SupplyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Supply {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private SupplyRarity supplyRarity;

    @Enumerated(EnumType.STRING)
    private SupplyType supplyType;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Inventory> inventories;
}
