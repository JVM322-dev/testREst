package com.example.marketplace.controllers;

import com.example.marketplace.Model.Product;
import com.example.marketplace.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Product")
@AllArgsConstructor
public  class ProductController {
      public final ProductService products_service;
      //controller
     @GetMapping
      public List<Product> findAllProducts(){
          return products_service.findAllProduct();
      }
      @PostMapping("/save_product")
      public Product SaveProduct(@RequestBody  Product product){
        return products_service.SaveProduct(product);
      }
      @GetMapping("/{key}")
      public Product FindToUnic_key(@PathVariable("key") String key){
         return products_service.FindToUnic_key(key);
      }
      @PutMapping("/update_student")
      public Product UpdateProduct(Product product){
         return products_service.UpdateProduct(product);
      }
      @DeleteMapping("/delete_product/{key}")
      public void Delete(@PathVariable("key") String key){
         products_service.Delete(key);
      }
}
