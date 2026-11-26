package com.jforcetask.jforce_libraray_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//handles the htmlpages
@Controller
public class pagecontroller {

	    @GetMapping("/")
	    public String home() {
	        return "login";
	    }

	    @GetMapping("/register")
	    public String register() {
	        return "registration";
	    }

	    @GetMapping("/login")
	    public String login() {
	        return "login";
	    }
	    
	    @GetMapping("/addbook")
	    public String addbook() {
	    	return "addbook";
	    }
	    
	    @GetMapping("/updatebook/{id}")
	    public String updatebook() {
	    	return "updatebook";
	    }
	}


