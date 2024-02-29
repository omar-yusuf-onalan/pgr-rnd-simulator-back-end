package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserSaveRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface UserMapper {
    User asUser(UserSaveRequest userSaveRequest);

    UserResponse asUserResponse(User user);

    void update(@MappingTarget User user, UserSaveRequest userSaveRequest);
}
