package com.pranjalgoyal.service.impl;

import com.pranjalgoyal.dao.ProductRepo;
import com.pranjalgoyal.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    public ProductRepo productRepo;

    public Products saveDetails(Products products) {
        return productRepo.save(products);
    }

    public List<Products> getList() {
        return productRepo.findAll();
    }

    public Products updateProduct(Products products) {
        return productRepo.save(products);
    }

    public void deleteById(long id) {
        productRepo.deleteById(id);
    }

    public Products getById(long id) {
        return productRepo.findById(id).get();
    }
}