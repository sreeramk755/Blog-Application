package com.blog.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.blog.platform.payloads.UserDto;
import com.blog.platform.payloads.ApiResponse;
import com.blog.platform.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController{ 
	
	@Autowired
	private UserService userService;
	
	//POST -create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
		UserDto createdUserDto=userService.createUser(userDto);
		return new ResponseEntity<>(createdUserDto,HttpStatus.CREATED);
	}
	
	//PUT - update user
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable("userId") Integer uid){
		UserDto updatedUser=this.userService.updateUser(userDto, uid);
		return new ResponseEntity<>(updatedUser,HttpStatus.OK);
	}
	
	//DELETE- delete user
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer uid ){
		this.userService.deleteUser(uid);
		return new ResponseEntity<>(new ApiResponse("user deleted successfully",true),HttpStatus.OK);
	}
	
	//GET- single user
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable("userId") Integer uid){
		UserDto userDto=this.userService.getUserById(uid);
		return new ResponseEntity<>(userDto,HttpStatus.OK);
	}
	
	//GET- all users
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers(){
		List<UserDto> userList=this.userService.getAllUsers();
		return new ResponseEntity<>(userList,HttpStatus.OK);
	}
	
}