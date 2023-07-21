package com.loconav.event.management.controller;

import com.loconav.event.management.model.request.UserRequest;
import com.loconav.event.management.model.response.UserResponse;
import com.loconav.event.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("")
    UserResponse users(@Valid @RequestBody UserRequest userRequest){
        return userService.create(userRequest);
    }

    @GetMapping("/list")
    List<UserResponse> listAll(@RequestParam (name = "id", required = false)final Integer id){
        return userService.list(id);
    }
}
