package com.toyrnotus.toyrnotusapp.controllers;

import com.toyrnotus.toyrnotusapp.dtos.SearchProductsResp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("products")
public class ProductsController {

    private String age;
    private String gender;


    @RequestMapping(method = RequestMethod.GET)
    public SearchProductsResp searchProducts (@RequestParam("age") String age, @RequestParam("gender") String gender)
    {
        return null;
    }
}
