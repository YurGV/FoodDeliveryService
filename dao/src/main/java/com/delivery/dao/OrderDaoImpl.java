package com.delivery.dao;

import com.delivery.api.dao.OrderDao;
import com.delivery.domain.Order;

public class OrderDaoImpl extends AbstractDao<Order> implements OrderDao {
    @Override
    public Order getById(Long id) {
        return null;
    }
}
