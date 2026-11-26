package com.jforcetask.jforce_libraray_management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jforcetask.jforce_libraray_management.entity.User;

public interface userRepository extends JpaRepository<User, Long>{

	    Optional<User> findByUsername(String username);

//	    boolean existsByUsername(String username);

	    boolean existsByEmail(String email);
	    
	    
	}


