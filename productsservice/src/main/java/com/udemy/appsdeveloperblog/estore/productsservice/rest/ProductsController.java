package com.udemy.appsdeveloperblog.estore.productsservice.rest;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/products")
public class ProductsController {

    @PostMapping
    public String createProduct() {return "HTTP POST is handled, bro.";}
    
    @GetMapping
    public String getProduct(){
        return "HTTP GET handled, bro.";
    }
    
    @PutMapping
    public String updateProduct() {
        return "HTTP PUT handled, bro.";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "HTTP DELETE handled, bro.";
    }
    
}
