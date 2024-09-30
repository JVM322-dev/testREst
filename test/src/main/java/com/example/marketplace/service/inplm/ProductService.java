package com.example.marketplace.service.inplm;

import com.example.marketplace.Model.Product;
import com.example.marketplace.repository.DataProductmanagement;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductService implements com.example.marketplace.service.ProductService {
    //servicemethod
    private final DataProductmanagement product_data;
    @Override
    public List<Product> findAllProduct(){
        return  product_data.findAllProduct();

    }

    @Override
    public Product SaveProduct(Product product) {
        return product_data.SaveProduct(product);
    }

    @Override
    public Product FindToUnic_key(String key) {
        return product_data.FindToUnic_key(key);
    }

    @Override
    public Product UpdateProduct(Product product) {
        return product_data.UpdateProduct(product);
    }

    @Override
    public void Delete(String key) {
         product_data.Delete(key);
    }


}
