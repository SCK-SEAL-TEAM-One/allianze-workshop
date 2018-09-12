package com.toyrnotus.toyrnotusapp.services;

import static org.junit.Assert.assertEquals;

import com.toyrnotus.toyrnotusapp.entities.Product;
import com.toyrnotus.toyrnotusapp.repositories.ProductRepository;
import com.toyrnotus.toyrnotusapp.services.impl.ProductServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceTest {
    @InjectMocks
    private ProductServiceImpl productService;

    @Mock
    private ProductRepository productRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void searchProduct_with_age_3to5_gender_Female_should_be_return_3_productList(){
        List<Product> productList= new ArrayList<>();
        Product product1 = Mockito.mock(Product.class);
        productList.add(product1);

        Product product2 = Mockito.mock(Product.class);
        productList.add(product2);

        Product product3 = Mockito.mock(Product.class);
        productList.add(product3);

        Mockito.doReturn(productList).when(productRepository).findByAgeAndGender("3_to_5", "Female");

        List<Product> result  = productService.searchProduct("3_to_5", "Female");
        assertEquals(3,result.size());
    }

}
