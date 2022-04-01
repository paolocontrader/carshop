package com.example.userservice.converter;

import org.springframework.stereotype.Component;

import com.example.userservice.dto.UserDTO;
import com.example.userservice.entity.User;


/**
 * Questa classe implementa i metodi di conversione dell'entità User.
 *  
 * @author Vittorio Valent & Girolamo Murdaca
 * 
 *@see AbstractConverter
 *@see Converter
 */
@Component
public class UserConverter extends AbstractConverter<User,UserDTO> {

	@Override
	public User toEntity(UserDTO userDTO) {
		User user = null;
		if (userDTO != null) {
			user = new User(userDTO.getId(),userDTO.getUsername(),userDTO.getPassword(),userDTO.getUsertype());			
		}
		return user;
	}

	@Override
	public UserDTO toDTO(User user) {
		UserDTO userDTO = null;
		if (user != null) {
			userDTO = new UserDTO(user.getId(),user.getUsername(),user.getPassword(),user.getUsertype());
			
		}
		return userDTO;
	}
}