package com.bezkoder.spring.login.repository;

import java.util.Optional;

import com.bezkoder.spring.login.models.Addproduct;

import org.springframework.stereotype.Repository;
@Repository
public interface AddProductRepository {

    Optional<Addproduct> findByProname(String pro_name);
    Boolean existsByProname(String pro_name);
    

    static Addproduct save(Addproduct addproduct) {
        return null;
    }
    
}
