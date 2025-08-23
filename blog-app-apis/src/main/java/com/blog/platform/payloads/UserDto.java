package com.blog.platform.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Setter
public class UserDto{
	
	private int id;
	
	@NotNull
	@Size(min=3,message="name cannot be less than 3 characters")
	private String name;
	
	@Email
	private String email;
	
	@NotNull
	@Size(min=5,max=8,message="password should be between 5 and 8 characters")
	private String password;
	
	private String about;
}