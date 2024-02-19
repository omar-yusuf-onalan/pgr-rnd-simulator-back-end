package com.omaryusufonalan.pgrrndsimulatorbackend.security;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AuthenticationRequest {
    private String username;
    private String password;
}
