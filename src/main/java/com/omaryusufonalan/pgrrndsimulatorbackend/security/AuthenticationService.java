package com.omaryusufonalan.pgrrndsimulatorbackend.security;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.currency.CurrencySaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.User;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.CurrencyType;
import com.omaryusufonalan.pgrrndsimulatorbackend.enums.Role;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.UserMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.UserRepository;
import com.omaryusufonalan.pgrrndsimulatorbackend.service.currency.CurrencyService;
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
    private final CurrencyService currencyService;

    public AuthenticationResponse register(UserSaveRequest userSaveRequest) {
        User userToBeRegistered = userMapper.asUser(userSaveRequest);

        userToBeRegistered.setRole(Role.PLAYER);
        userToBeRegistered.setPassword(passwordEncoder.encode(userToBeRegistered.getPassword()));

        initializeUserCurrencies(userRepository.save(userToBeRegistered));

        return new AuthenticationResponse(jwtService.generateToken(userToBeRegistered));
    }

    private void initializeUserCurrencies(User user) {
        CurrencyType[] currencyTypes = CurrencyType.values();

        for (CurrencyType currencyType : currencyTypes) {
            UserUpdateRequest userUpdateRequest =  new UserUpdateRequest(
                    user.getId(),
                    user.getUsername(),
                    user.getUsername()
            );

            CurrencySaveRequest currencySaveRequest = new CurrencySaveRequest(
                    0,
                    currencyType,
                    userUpdateRequest
                    );

            currencyService.create(currencySaveRequest);
        }
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
