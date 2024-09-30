package com.example.marketplace.repository;

import com.example.marketplace.Model.Product;
import org.springframework.stereotype.Repository;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


@Repository
public class DataProductmanagement {
    //servicemethod
   public final List<Product> products  = new ArrayList<>();
    public List<Product> findAllProduct(){
        return products;

    }


    public Product SaveProduct(Product product){
        products.add(product);
        return product;
    }


    public Product FindToUnic_key(String u_key) {
        return products.stream().filter(product -> product.getUnic_key_p().equals(u_key)).findFirst().orElse(null);

    }


    public Product UpdateProduct(Product product) {
        var ProductIndex = IntStream.range(0,products.size()).filter(prod->products.get(prod).getUnic_key_p().equals(product.getUnic_key_p())).findFirst().orElse(-1);
        if(ProductIndex>-1){
            products.set(ProductIndex,product);
            return  product;
        }
        return null;
    }


    public void Delete(String key) {
      var product = FindToUnic_key(key);
      if(product!=null){
          products.remove(product);
      }

    }

}
