package com.omaryusufonalan.pgrrndsimulatorbackend.security;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.omaryusufonalan.pgrrndsimulatorbackend.config.ApplicationConfig.BASE_URL;

@RestController
@RequestMapping(BASE_URL + "auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody UserSaveRequest userSaveRequest) {
        return ResponseEntity.ok(authenticationService.register(userSaveRequest));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest) {
        return ResponseEntity.ok(authenticationService.authenticate(authenticationRequest));
    }
}
