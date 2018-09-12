package com.toyrnotus.toyrnotusapp.controllers;


import com.toyrnotus.toyrnotusapp.dtos.Product;
import com.toyrnotus.toyrnotusapp.dtos.SearchProductsResp;
import com.toyrnotus.toyrnotusapp.services.ProductService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductsControllerTest {

    @InjectMocks
    private ProductsController productsController;

    @Mock
    private ProductService productService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void searchProductsByAge3To5AndGenderFemaleShouldBe3Products() {
        String age = "3_to_5";
        String gender = "Female";

        List productList = new ArrayList();
        Product product1 = Mockito.mock(Product.class);
        productList.add(product1);
        Mockito.doReturn(productList).when(productService).searchProduct("3_to_5","Female");

        SearchProductsResp result =  productsController.searchProducts(age,gender);
        List results = result.getProducts();
        Assert.assertNotNull(results);
        Assert.assertEquals(productList,results);

    }

    private void setProduct(SearchProductsResp expectedResult) {
        Product product = new Product();
        product.setBrand("CoolKidz");
        product.setAvailability("InStock");
        product.setName("43 Piece dinner Set");
        product.setPrice(new BigDecimal(12.95));

        Product product2 = new Product();
        product.setBrand("CoolKidz");
        product.setAvailability("InStock");
        product.setName("Best Friends Forever Magnetic Press Up");
        product.setPrice(new BigDecimal(24.95));

        Product product3 = new Product();
        product.setBrand("CoolKidz");
        product.setAvailability("InStock");
        product.setName("Princess Palace");
        product.setPrice(new BigDecimal(24.95));

        List products = new ArrayList();
        products.add(product);
        products.add(product2);
        products.add(product3);

        expectedResult.setProducts(products);
    }


}