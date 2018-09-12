package com.toyrnotus.controllers;

import com.toyrnotus.dtos.SearchProductsResp;

@Controller
@RequestMapping("products")
public class ProductsController {

    @RequestMapping()
    public SearchProductsResp searchProducts (@RequestParam("age") String age, @RequestParam("gender") String gender)
    {

    }
}
