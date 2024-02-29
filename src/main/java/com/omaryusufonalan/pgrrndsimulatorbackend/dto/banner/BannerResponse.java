package com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail.OnlyDropDetailResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.BannerType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ResearchType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.SupplyType;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BannerResponse {
    private Long id;

    private ResearchType researchType;

    private BannerType bannerType;

    private CurrencyType currencyType;

    private SupplyType primarySupply;

    private Set<OnlyDropDetailResponse> dropDetails;
}
