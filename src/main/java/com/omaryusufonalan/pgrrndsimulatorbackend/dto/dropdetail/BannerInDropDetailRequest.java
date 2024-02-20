package com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.BannerType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ResearchType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.SupplyType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BannerInDropDetailRequest {
    private Long id;

    private ResearchType researchType;

    private BannerType bannerType;

    private CurrencyType currencyType;

    private SupplyType primarySupply;
}
