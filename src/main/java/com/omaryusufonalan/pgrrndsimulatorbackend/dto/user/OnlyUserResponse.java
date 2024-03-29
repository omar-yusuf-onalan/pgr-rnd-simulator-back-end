package com.omaryusufonalan.pgrrndsimulatorbackend.dto.user;

import com.omaryusufonalan.pgrrndsimulatorbackend.enums.Role;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OnlyUserResponse {
    private Long id;

    private String username;

    private Role role;
}
