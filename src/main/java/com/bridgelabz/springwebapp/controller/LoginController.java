
package com.bridgelabz.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.springwebapp.model.LoginForm;
import com.bridgelabz.springwebapp.model.User;
import com.bridgelabz.springwebapp.service.UserService;

@Controller
public class LoginController {

	@Autowired
	public UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayLoginPage() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("login", new LoginForm());
		return mv;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(@ModelAttribute("login") LoginForm login) {
		ModelAndView mv = null;
		User user = userService.validateUser(login);

		if (null != user) {
			return new ModelAndView("welcome", "firstName", user.getFirstName());
		} else {
			return new ModelAndView("login", "message", "Username or Password is incorrect!");
		}
	}
}
