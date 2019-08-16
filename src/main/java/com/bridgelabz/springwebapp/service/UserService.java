package com.bridgelabz.springwebapp.service;

import com.bridgelabz.springwebapp.model.LoginForm;
import com.bridgelabz.springwebapp.model.User;

public interface UserService {

	public void register(User user);

	public User validateUser(LoginForm login);

}
