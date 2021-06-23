package com.delivery.api.dao;


import com.sun.security.ntlm.Client;

import java.util.List;

public interface GenericDao<T> {

    void save(T entity);
    T getById(Long id);
    List<T> getAll();
    void delete(T entity);

}
