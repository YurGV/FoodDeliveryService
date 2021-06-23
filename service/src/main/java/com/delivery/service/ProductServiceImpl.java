package com.delivery.service;

import com.delivery.api.dao.MarketDao;
import com.delivery.api.dao.ProductDao;
import com.delivery.api.service.ProductService;
import com.delivery.domain.Market;
import com.delivery.domain.Product;
import com.delivery.domain.enums.Category;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;
    private final MarketDao marketDao;

    public ProductServiceImpl(ProductDao productDao, MarketDao marketDao) {
        this.productDao = productDao;
        this.marketDao = marketDao;
    }

    public List<Product> addCProduct(Market market, Product product) {
        Market upMarket = marketDao.getById(market.getId());
        List<Product> marketProducts = upMarket.getProducts();
        marketProducts.add(product);
        marketDao.save(upMarket);
        return marketProducts;
    }

    public Product getProduct(Long id) {
        return productDao.getById(id);
    }

    public List<Product> getAllProducts() {
        return productDao.getAll();
    }

    public Product updateProduct(Market market, Product product) throws Exception {
       List <Product> editProduct =  marketDao.getById(market.getId()).getProducts();
       Product pr = editProduct.stream()
               .filter(x -> x.getId().equals(product.getId()))
               .findFirst()
               .orElseThrow(Exception::new);
       productDao.save(product);
        return pr;
    }


    public List<Product> sortByCost() {
        List<Product> products = productDao.getAll();
        products.sort(Comparator.comparingInt(Product::getCost));
        return products;
    }

    public List<Product> sortByCategory() {
        List<Product> products = productDao.getAll();

        return products.stream().sorted(
                Comparator.comparing(Product::getName).thenComparing(Product::getCategory))
                .collect(Collectors.toList());
    }

    public List<Product> findAllByCategory(Category category) {
        return productDao.getAll().stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public void deleteProduct(Long id) {
        productDao.delete(productDao.getById(id));
    }
}
