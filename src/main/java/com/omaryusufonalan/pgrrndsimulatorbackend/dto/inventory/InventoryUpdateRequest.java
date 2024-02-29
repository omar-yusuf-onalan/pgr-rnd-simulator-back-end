package com.omaryusufonalan.pgrrndsimulatorbackend.dto.inventory;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserUpdateRequest;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class InventoryUpdateRequest {
    private Long id;

    private UserUpdateRequest user;
}
