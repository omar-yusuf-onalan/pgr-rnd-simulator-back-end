package com.omaryusufonalan.pgrrndsimulatorbackend.entity;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.BannerType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ResearchType;
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
public class Banner {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private ResearchType researchType;

    @Enumerated(EnumType.STRING)
    private BannerType bannerType;

    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;

    @Enumerated(EnumType.STRING)
    private SupplyType primarySupply;
}
