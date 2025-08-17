package com.blog.platform.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.platform.payloads.UserDto;
import com.blog.platform.services.UserService;
import com.blog.platform.repositories.UserRepo;
import com.blog.platform.entities.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto userDto) {
		
		User user=this.userDtoToUser(userDto);
		User savedUser=this.userRepo.save(user);
		return this.userToUserDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub

	}
	
	private User userDtoToUser(UserDto userDto) {
		User user=new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		user.setEmail(userDto.getEmail());
		
		return user;
	}
	
	private UserDto userToUserDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setAbout(user.getAbout());
		userDto.setEmail(user.getEmail());
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setPassword(user.getPassword());
		
		return userDto;
	}

}
