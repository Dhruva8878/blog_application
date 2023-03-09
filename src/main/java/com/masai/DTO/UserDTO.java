package com.masai.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
	
	private Integer userId;
	
	@NotNull
	@Size(min = 3, message = "userName must of length of 3 characters !!")
	private String userName;
	
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 10, message = "password must be of min 3 char and max 10 char")
	private String password;
	
	@Email(message = "Email is not Valid !!")
	private String email;
	
	@NotNull
	@NotEmpty
	private String about;
}
