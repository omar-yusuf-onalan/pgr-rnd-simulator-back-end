package com.omaryusufonalan.pgrrndsimulatorbackend.dto.dropdetail;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.banner.OnlyBannerResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.ItemType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.SupplyRarity;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.SupplyType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DropDetailResponse {
    private Long id;

    private SupplyType supplyType;

    private SupplyRarity supplyRarity;

    private ItemType itemType;

    private double baseDropRate;

    private int pityGuarantee;

    private int shardsObtainedFromDuplicate;

    private OnlyBannerResponse banner;
}
