package com.graymatter.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.demo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	
	
}
