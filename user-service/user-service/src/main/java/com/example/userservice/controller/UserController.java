package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.dto.UserDTO;
import com.example.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractController<UserDTO>{
    @Autowired
    private UserService userService;

   @Override
    @GetMapping("/getall")
    public Iterable <UserDTO> getAll(){
    	return userService.getAll();
    }

}
