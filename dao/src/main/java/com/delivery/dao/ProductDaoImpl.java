package com.delivery.dao;

import com.delivery.api.dao.ProductDao;
import com.delivery.domain.Product;

public class ProductDaoImpl extends AbstractDao<Product> implements ProductDao {
    @Override
    public Product getById(Long id) {
        return null;
    }
}
