package com.omaryusufonalan.pgrrndsimulatorbackend.mapper;

import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserRequest;
import com.omaryusufonalan.pgrrndsimulatorbackend.dto.user.UserResponse;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.user.Player;
import com.omaryusufonalan.pgrrndsimulatorbackend.entity.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface UserMapper {
    User asUser(UserRequest userRequest);

    Player asPlayer(UserRequest userRequest);

    UserResponse asUserResponse(User user);

    void update(@MappingTarget User user, UserRequest userRequest);
}
