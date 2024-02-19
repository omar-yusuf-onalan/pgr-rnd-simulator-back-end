package com.omaryusufonalan.pgrrndsimulatorbackend.service.user;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserResponse;

public interface GetUserDTO {
    UserResponse getResponseById(Long id);
}
