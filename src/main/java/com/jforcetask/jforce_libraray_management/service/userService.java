package com.jforcetask.jforce_libraray_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforcetask.jforce_libraray_management.entity.User;
import com.jforcetask.jforce_libraray_management.repository.userRepository;

@Service
public class userService {

	    @Autowired
	    private userRepository userrepo;

	    // Registration Logic
	    public String registerUser(User user) {

//	        if (userrepo.existsByUsername(user.getUsername())) {
//	            return "Username already exists!";
//	        }

	        if (userrepo.existsByEmail(user.getEmail())) {
	            return "Email already exists!";
	        }
	        userrepo.save(user);
	        return "Registration Successful!";
	    }

	    // Login Logic
	    public String loginUser(User user) {
	        User existingUser = userrepo.findByUsername(user.getUsername()).orElse(null);

	        if (existingUser != null &&
	                existingUser.getPassword().equals(user.getPassword())) {

	            return "Login Successful!";
	        }
	        return "Invalid Username or Password!";
	    }
	}

