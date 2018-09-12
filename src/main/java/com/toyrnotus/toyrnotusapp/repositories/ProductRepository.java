package com.toyrnotus.toyrnotusapp.repositories;

import com.toyrnotus.toyrnotusapp.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    public List<Product> findByAgeAndGender(String age, String gender);

    public Product findOne(String id);
}
