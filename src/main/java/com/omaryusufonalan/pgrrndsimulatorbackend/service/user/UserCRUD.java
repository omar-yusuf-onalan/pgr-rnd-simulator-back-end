package com.omaryusufonalan.pgrrndsimulatorbackend.service.user;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.User;

// UserCRUD does not have a create method; check AuthenticationService
public interface UserCRUD {
    User getById(Long id);
    UserResponse update(Long id, UserRequest userRequest);
    void delete(Long id);
}
