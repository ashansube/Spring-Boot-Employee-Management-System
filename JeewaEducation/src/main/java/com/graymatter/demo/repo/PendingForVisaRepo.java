package com.graymatter.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.demo.model.PendingForVisa;
#dsds
@Repository
public interface PendingForVisaRepo extends JpaRepository<PendingForVisa, Integer> {

}
