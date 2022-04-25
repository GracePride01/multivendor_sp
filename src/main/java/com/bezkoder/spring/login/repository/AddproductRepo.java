package com.bezkoder.spring.login.repository;

import com.bezkoder.spring.login.models.Addproduct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

public interface AddproductRepo extends JpaRepository<Addproduct,Integer> {
    
}
