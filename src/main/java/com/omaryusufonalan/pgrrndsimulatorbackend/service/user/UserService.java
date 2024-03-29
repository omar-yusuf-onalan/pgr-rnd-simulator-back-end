package com.omaryusufonalan.pgrrndsimulatorbackend.service.user;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserUpdateRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.User;
import com.omaryusufonalan.pgrrndsimulatorbackend.mapper.UserMapper;
import com.omaryusufonalan.pgrrndsimulatorbackend.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserCRUD, GetUserDTO {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User with ID " + id + " not found"));
    }

    @Override
    public UserResponse update(Long id, UserUpdateRequest userUpdateRequest) {
        User userToBeUpdated = getById(id);
        userUpdateRequest.setPassword(passwordEncoder.encode(userToBeUpdated.getPassword()));

        userMapper.update(userToBeUpdated, userUpdateRequest);

        return userMapper.asUserResponse(userRepository.save(userToBeUpdated));
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(getById(id));
    }

    @Override
    public UserResponse getResponseById(Long id) {
        return userMapper.asUserResponse(getById(id));
    }
}
