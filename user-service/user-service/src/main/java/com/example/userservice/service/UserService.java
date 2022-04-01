package com.example.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userservice.converter.UserConverter;
import com.example.userservice.dto.UserDTO;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;


@Service
public class UserService extends AbstractService<User,UserDTO> {
	
	@Autowired
	UserRepository repository;
	//ALL crud methods in AbstractService
	
	@Autowired
	UserConverter converter;
	
	//LOGIN method
	public UserDTO findByUsernameAndPassword(String username, String password) {
		return converter.toDTO(repository.findByUsernameAndPassword(username, password));
	}

}
