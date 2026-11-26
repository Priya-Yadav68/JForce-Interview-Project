package com.jforcetask.jforce_libraray_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jforcetask.jforce_libraray_management.entity.book;
import com.jforcetask.jforce_libraray_management.service.bookService;

@RestController
@RequestMapping("/api/books")
public class bookController {
	
	@Autowired
	private bookService service;
	
	@PostMapping //http://localhost:8080/addbook
	public String addbook(@RequestBody book b) {
		return service.addbook(b);
	}
	
	@PutMapping("/{id}")  //http://localhost:8080/updatebook/2
	public String updatebook(@PathVariable Long id,@RequestBody book b) {
		return service.updatebook(id, b);
	}

}
