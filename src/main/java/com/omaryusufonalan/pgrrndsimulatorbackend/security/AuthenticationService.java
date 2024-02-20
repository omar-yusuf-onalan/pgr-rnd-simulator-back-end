package com.omaryusufonalan.pgrrndsimulatorbackend.security;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.user.Player;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.user.User;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.Role;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.UserMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(UserRequest userRequest) {
        Player playerToBeRegistered = userMapper.asPlayer(userRequest);

        playerToBeRegistered.setRole(Role.PLAYER);
        playerToBeRegistered.setPassword(passwordEncoder.encode(playerToBeRegistered.getPassword()));

        userRepository.save(playerToBeRegistered.initializePlayerCurrencies());

        return new AuthenticationResponse(jwtService.generateToken(playerToBeRegistered));
    }

    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequest.getUsername(),
                        authenticationRequest.getPassword()
                )
        );

        User userToBeRetrieved = userRepository.findByUsername(authenticationRequest.getUsername())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new AuthenticationResponse(jwtService.generateToken(userToBeRetrieved));
    }
}
