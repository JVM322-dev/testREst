package com.example.marketplace.service;

import com.example.marketplace.Model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

      public List<Product> findAllProduct();
       public Product SaveProduct(Product product);
       public Product FindToUnic_key(String key);
       public Product UpdateProduct(Product product);
       public void Delete(String key);



}
