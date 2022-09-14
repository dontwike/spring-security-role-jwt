package com.pranjalgoyal.controller;

import com.pranjalgoyal.service.impl.ProductService;
import com.pranjalgoyal.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    public ProductService productService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public Products saveDetails(@RequestBody Products products){
        return productService.saveDetails(products);
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/getList")
    public List<Products> getList(){
        return productService.getList();
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/getProductById/{id}")
    public Products getById(@PathVariable("id") long id){
        return productService.getById(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public Products updateProduct(@RequestBody Products products){
        return productService.updateProduct(products);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") long id){
        productService.deleteById(id);
        return "ID Deleted Successfully";
    }
}
