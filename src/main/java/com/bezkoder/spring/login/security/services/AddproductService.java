package com.bezkoder.spring.login.service;
import com.bezkoder.spring.login.models.Addproduct;

import java.util.List;
public interface AddproductService {

    // Save operation
    Addproduct saveAddproduct (Addproduct  addproduct);
 
    // Read operation
    List<Addproduct> fetchAddproductList();
 
    // Update operation
    // Addproduct  updateAddproduct (Addproduct  addproduct,
    // int pro_id);
 
    // Delete operation
    void deleteAddproductById(int pro_id);
    
}
