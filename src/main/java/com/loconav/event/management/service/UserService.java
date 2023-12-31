package com.loconav.event.management.service;

import com.loconav.event.management.mapper.UserMapper;
import com.loconav.event.management.model.request.UserRequest;
import com.loconav.event.management.model.response.UserResponse;
import com.loconav.event.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserResponse create(UserRequest userRequest) {
        return userMapper.userToUserResponse(userRepository.save(userMapper.userRequestToUser(userRequest)));
    }

    public List<UserResponse> list(Integer id){
        return userMapper.userToList(userRepository.fetch(id));
    }

}