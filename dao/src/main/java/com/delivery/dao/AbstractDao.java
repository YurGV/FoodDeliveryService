package com.delivery.dao;

import com.delivery.api.dao.GenericDao;
import com.delivery.domain.Market;
import com.delivery.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractDao<T> implements GenericDao<T> {


    private final List<T>  repository = new ArrayList<>();

    @Override
    public void save(T entity) {
        repository.add(entity);
    }

    @Override
    public abstract T getById(Long id);

    @Override
    public List<T> getAll() {
        return new ArrayList<>(repository);
    }

    @Override
    public void delete(T entity) {
        repository.remove(entity);
    }
}
