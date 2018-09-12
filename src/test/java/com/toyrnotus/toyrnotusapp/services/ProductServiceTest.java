package com.toyrnotus.toyrnotusapp.services;

import com.toyrnotus.toyrnotusapp.entities.Product;
import com.toyrnotus.toyrnotusapp.services.impl.ProductServiceImpl;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProductServiceTest {
    @InjectMocks
    private ProductServiceImpl productService

    @Mock
    private ProductRepository productRepository;

    @Test
    public void searchProduct_with_age_3to5_gender_Female_should_be_return_3_productList(){

        List<Product> productList=productService.searchProduct("3_to_5", "Female");

    }

}
