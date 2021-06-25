package com.delivery.api.service;

import com.delivery.domain.Market;
import com.delivery.domain.Product;
import com.delivery.domain.enums.Category;

import java.util.List;

public interface ProductService {

    List<Product> addCProduct(Market market, Product product);
    Product getProduct(Long id);
    List<Product> getAllProducts();
    Product updateProduct(Market market, Product product) throws Exception;
    void deleteProduct(Long id);
    List<Product> sortByCost();
    List<Product> sortByCategory();
    List<Product> findAllByCategory(Category category);
}
