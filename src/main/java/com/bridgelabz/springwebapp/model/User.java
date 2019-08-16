package com.bridgelabz.springwebapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String address;

	private long phone;
	private String userName;
	private String password;

}
