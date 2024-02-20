package com.omaryusufonalan.pgrrndsimulatorbackend.entity;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ItemType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.SupplyRarity;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.SupplyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DropDetail {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private SupplyType supplyType;

    @Enumerated(EnumType.STRING)
    private SupplyRarity supplyRarity;

    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    private double baseDropRate;

    private int pityGuarantee;

    private int shardsObtainedFromDuplicate;

    @ManyToOne
    private Banner banner;
}
