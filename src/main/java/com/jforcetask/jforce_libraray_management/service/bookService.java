package com.jforcetask.jforce_libraray_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforcetask.jforce_libraray_management.entity.book;
import com.jforcetask.jforce_libraray_management.repository.bookRepository;
@Service
public class bookService {
	@Autowired
	private bookRepository bookrepo;
	
	public String addbook(book b) {
		bookrepo.save(b);
		return "successfully added";
	}
	
	public String updatebook(Long id,book b) {
		if(bookrepo.existsById(id)) {
			b.setId(id);
			bookrepo.save(b);
			return "book data updated";
		}
		return "invalid user";
	}
	
}
