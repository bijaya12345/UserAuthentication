package com.hcl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.services.UserService;


@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping(path = "/")
	String defaultPage() {
		logger.info("Mapping to index");
		return "user/index";
	}

	@PostMapping(path = "/login")
	String submitLogin(@RequestParam(name = "username") String username,@RequestParam(name = "password") String password) {
		logger.info("post mapping /submitLogin");
		  if(userService.verifyLogin(username,password)) {
		  	return "user/successful"; }
		return "user/index";
		

	}

}
