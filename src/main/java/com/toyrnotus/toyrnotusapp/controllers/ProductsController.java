package com.toyrnotus.toyrnotusapp.controllers;

import com.toyrnotus.toyrnotusapp.dtos.SearchProductsResp;
import com.toyrnotus.toyrnotusapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductsController {

    @Autowired
    private ProductService productService;


    @RequestMapping(method = RequestMethod.GET)
    public SearchProductsResp searchProducts (@RequestParam("age") String age, @RequestParam("gender") String gender)
    {
        SearchProductsResp resp = new SearchProductsResp();
        List productList = productService.searchProduct(age,gender);
        resp.setProducts(productList);

        return resp;
    }

}
