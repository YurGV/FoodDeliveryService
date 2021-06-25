package com.delivery.dao;

import com.delivery.api.dao.ProductDao;
import com.delivery.domain.Product;

import java.util.ArrayList;

public class ProductDaoImpl extends AbstractDao<Product> implements ProductDao {

    private final ArrayList<Product> repo = new ArrayList<>();

    @Override
    public Product getById(Long id) {

        return repo.stream()
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
