package com.graymatter.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.demo.model.VisaStudent;

public interface VisaStudentRepo extends JpaRepository<VisaStudent, Integer> {

}
