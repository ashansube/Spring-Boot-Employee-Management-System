package com.graymatter.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.demo.model.PendingForVisa;

@Repository
public interface PendingForVisaRepo extends JpaRepository<PendingForVisa, Integer> {

	List<PendingForVisa> findByCity(String city);
	
}
