package com.company.product.controller;


import com.company.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class ProductController {

   @Autowired
   private ProductService productService;

}
