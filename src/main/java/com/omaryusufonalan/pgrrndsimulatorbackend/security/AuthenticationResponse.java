package com.omaryusufonalan.pgrrndsimulatorbackend.security;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AuthenticationResponse {
    private String token;
}
