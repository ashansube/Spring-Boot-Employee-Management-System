package com.graymatter.demo.visa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.demo.visa.model.PendingForVisa;

@Repository
public interface PendingForVisaRepo extends JpaRepository<PendingForVisa, Integer>  {

}
