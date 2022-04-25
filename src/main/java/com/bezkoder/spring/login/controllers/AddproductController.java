package com.bezkoder.spring.login.controllers;

import java.util.List;

import javax.validation.Valid;

import com.bezkoder.spring.login.models.Addproduct;
import com.bezkoder.spring.login.security.services.AddproductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Annotation
@RestController
public class AddproductController {
    // Annotation
    @Autowired private AddproductService addproductService;
 
    // Save operation
    @PostMapping("/departments")
    public Addproduct saveAddproduct(
        @Valid @RequestBody Addproduct addproduct)
    {
        return addproductService.saveAddproduct(addproduct);
    }
 
    // Read operation
    @GetMapping("/departments")
    public List<Addproduct> fetchAddproductList()
    {
        return addproductService.fetchAddproductList();
    }
 
    // Update operation
    // @PutMapping("/departments/{id}")
    // public Addproduct
    // updateAddproduct(@RequestBody Addproduct addproduct,
    //                  @PathVariable("id") int pro_id)
    // {
    //     return addproductService.updateAddproduct(
    //         addproduct, pro_id);
    // }
 
    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteAddproductById(@PathVariable("id")
    int pro_id)
    {
        addproductService.deleteAddproductById(
            pro_id);
        return "Deleted Successfully";
    }
}