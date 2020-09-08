package com.graymatter.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.graymatter.demo.model.VisaStudent;

public interface VisaStudentRepo extends JpaRepository<VisaStudent, Integer> {

	@Query("from VisaStudent where username=?1 and password=?2")
	VisaStudent LoginCheack(String username, String pass);
	
	@Query("select id from VisaStudent where username=?1")
	VisaStudent findByIdByUsername(String username);
	
}
