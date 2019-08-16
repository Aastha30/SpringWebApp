package com.bridgelabz.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.springwebapp.model.User;
import com.bridgelabz.springwebapp.service.UserService;

@Controller
public class RegistrationController {

	@Autowired
	public UserService userService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView displayRegisterPage() {
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("user", new User());
		return mv;
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView insertUser(@ModelAttribute("user") User user, BindingResult result) {
		userService.register(user);
		System.out.println(user);
		return new ModelAndView("registersuccess", "msg", "Your account is successfully registered");
	}
}
