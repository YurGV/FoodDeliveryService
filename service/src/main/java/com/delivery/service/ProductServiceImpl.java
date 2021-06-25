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

    private final ProductDao productDao;                        // for loose coupling use DAO interface
    private final MarketDao marketDao;

    public ProductServiceImpl(ProductDao productDao, MarketDao marketDao) {     // constructor parameter
        this.productDao = productDao;
        this.marketDao = marketDao;
    }

    public List<Product> addCProduct(Market market, Product product) {          // add a product to the list of a specific Market
        Market upMarket = marketDao.getById(market.getId());
        List<Product> marketProducts = upMarket.getProducts();
        marketProducts.add(product);
        marketDao.save(upMarket);
        return marketProducts;
    }

    public Product getProduct(Long id) {
        return productDao.getById(id);
    }     // get Product by Id

    public List<Product> getAllProducts() {
        return productDao.getAll();
    }       // get list all Products

    public Product updateProduct(Market market, Product product) throws Exception {     // update one Product to the list of a specific Market
       List <Product> editProduct =  marketDao.getById(market.getId()).getProducts();
       Product pr = editProduct.stream()
               .filter(x -> x.getId().equals(product.getId()))
               .findFirst()
               .orElseThrow(Exception::new);
       productDao.save(product);
        return pr;
    }

    public List<Product> sortByCost() {             // sorting all of the cost of production
        List<Product> products = productDao.getAll();
        products.sort(Comparator.comparingInt(Product::getCost));
        return products;
    }

    public List<Product> sortByCategory() {         //sorting all of the category of production
        List<Product> products = productDao.getAll();

        return products.stream().sorted(
                Comparator.comparing(Product::getName).thenComparing(Product::getCategory))
                .collect(Collectors.toList());
    }

    public List<Product> findAllByCategory(Category category) {  //find all products by a specific Category
        return productDao.getAll().stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public void deleteProduct(Long id) {            // delete product by Id number
        productDao.delete(productDao.getById(id));
    }
}
