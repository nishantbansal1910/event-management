package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.User;
import com.loconav.event.management.model.request.UserRequest;
import com.loconav.event.management.model.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);

    User userRequestToUser(UserRequest userRequest);

    UserResponse userToUserResponse(User user);

    List<UserResponse> userToList(List<User> users);


}
