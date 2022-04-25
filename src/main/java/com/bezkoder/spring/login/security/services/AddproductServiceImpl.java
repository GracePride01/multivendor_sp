package com.bezkoder.spring.login.security.services;

import com.bezkoder.spring.login.models.Addproduct;
import com.bezkoder.spring.login.repository.AddproductRepo;
//import com.bezkoder.spring.login.security.services.AddproductService;

// Importing required classes
import java.util.List;
//import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
public class AddproductServiceImpl implements AddproductService{
    @Autowired
    private AddproductRepo addproductRepository;
 
    // Save operation
    @Override
    public Addproduct saveAddproduct(Addproduct addproduct)
    {
        return addproductRepository.save(addproduct);
    }
 
    // Read operation
    @Override public List<Addproduct> fetchAddproductList()
    {
        return (List<Addproduct>)
        addproductRepository.findAll();
    }
 
    // Update operation
    // @Override
    // public Addproduct
    // updateAddproduct(Addproduct addproduct,
    //                  int pro_id)
    // {
    //     Addproduct depDB
    //         = addproductRepository.findById(pro_id)
    //               .get();
 
    //     if (Objects.nonNull(addproduct.getAddproductName())
    //         && !"".equalsIgnoreCase(
    //             addproduct.getAddproductName())) {
    //         depDB.setDepartmentName(
    //             addproduct.getAddproductName());
    //     }
 
    //     if (Objects.nonNull(
    //         addproduct.getAddproductAddress())
    //         && !"".equalsIgnoreCase(
    //             addproduct.getAddproductAddress())) {
    //         depDB.setDepartmentAddress(
    //             addproduct.getAddproductAddress());
    //     }
 
    //     if (Objects.nonNull(addproduct.getAddproductCode())
    //         && !"".equalsIgnoreCase(
    //             addproduct.getAddproductCode())) {
    //         depDB.setDepartmentCode(
    //             addproduct.getAddproductCode());
    //     }
        
    //     return addproductRepository.save(depDB);
    // }
 
    // Delete operation
    @Override
    public void deleteAddproductById(int pro_id)
    {
        addproductRepository.deleteById(pro_id);
    }
}  

