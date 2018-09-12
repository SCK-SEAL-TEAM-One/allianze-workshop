package com.toyrnotus.toyrnotusapp.services.impl;

import com.toyrnotus.toyrnotusapp.entities.Product;
import com.toyrnotus.toyrnotusapp.repositories.ProductRepository;
import com.toyrnotus.toyrnotusapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> searchProduct(String age, String gender){
        List<Product> productList = productRepository.findByAgeAndGender(age, gender);
        return productList;
    }

}
