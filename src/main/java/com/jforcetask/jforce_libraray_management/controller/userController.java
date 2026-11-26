package com.jforcetask.jforce_libraray_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jforcetask.jforce_libraray_management.entity.User;
import com.jforcetask.jforce_libraray_management.repository.userRepository;
import com.jforcetask.jforce_libraray_management.service.userService;

@RestController
@RequestMapping("/api")
public class userController {


	    @Autowired
	   private userService service;

	    @PostMapping("/register")  //http://localhost:8080/register
	    public String registerUser(@RequestBody User user) {
	        return service.registerUser(user);
	    }
	    

	    @PostMapping("/login") //http://localhost:8080/login
	    public String loginUser(@RequestBody User user) {
	        return service.loginUser(user);
	    }
	}


