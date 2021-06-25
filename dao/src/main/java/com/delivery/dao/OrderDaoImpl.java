package com.delivery.dao;

import com.delivery.api.dao.OrderDao;
import com.delivery.domain.Order;

import java.util.ArrayList;

public class OrderDaoImpl extends AbstractDao<Order> implements OrderDao {

    private final ArrayList<Order> repo = new ArrayList<>();

    @Override
    public Order getById(Long id) {

        return repo.stream()
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
