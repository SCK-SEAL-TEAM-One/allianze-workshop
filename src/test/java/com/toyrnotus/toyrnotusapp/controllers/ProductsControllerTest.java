package com.toyrnotus.toyrnotusapp.controllers;

import com.toyrnotus.toyrnotusapp.dtos.SearchProductsResp;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProductsControllerTest {

    private ProductsController productsController;
    @Test
    public void searchProductsByAge3To5AndGenderFemaleShouldBe3Products() {
        String age = "3_to_5";
        String gender = "Female";

        List expectedResult = new ArrayList();
        SearchProductsResp product = new SearchProductsResp();
        product.setBrand("CoolKidz");
        product.setAvailability("InStock");
        product.setName("43 Piece dinner Set");
        product.setPrice(new BigDecimal(12.95));

        SearchProductsResp product2 = new SearchProductsResp();
        product.setBrand("CoolKidz");
        product.setAvailability("InStock");
        product.setName("Best Friends Forever Magnetic Press Up");
        product.setPrice(new BigDecimal(24.95));

        SearchProductsResp product3 = new SearchProductsResp();
        product.setBrand("CoolKidz");
        product.setAvailability("InStock");
        product.setName("Princess Palace");
        product.setPrice(new BigDecimal(24.95));

        expectedResult.add(product);
        expectedResult.add(product2);
        expectedResult.add(product3);

        SearchProductsResp result =  productsController.searchProducts(age,gender);
        Assert.assertEquals();

    }


}