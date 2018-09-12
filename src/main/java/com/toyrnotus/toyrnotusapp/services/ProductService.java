package com.toyrnotus.toyrnotusapp.services;

import com.toyrnotus.toyrnotusapp.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    public List<Product> searchProduct(String age, String gender);
}
