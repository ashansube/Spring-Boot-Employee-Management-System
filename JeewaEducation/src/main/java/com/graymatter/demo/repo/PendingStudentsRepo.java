package com.graymatter.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.graymatter.demo.model.PendingStudents;

@Repository
public interface PendingStudentsRepo extends JpaRepository<PendingStudents, Integer> {

}
