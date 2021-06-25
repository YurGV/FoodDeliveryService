package com.delivery.service;

import com.delivery.api.dao.OrderDao;
import com.delivery.api.service.OrderService;
import com.delivery.domain.Client;
import com.delivery.domain.Market;
import com.delivery.domain.Order;
import com.delivery.domain.Product;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao;

    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }


    public Order addOrder(Market market, Client client, Product products) {

        Order order = new Order();
        orderDao.save(order);
        return order;
    }

    public Order getOrder(Long id) {
        return orderDao.getById(id);
    }

    public List<Order> getAllOrders() {
        return orderDao.getAll();
    }

    public void deleteOrder(Long id) {
        orderDao.delete(orderDao.getById(id));
    }
}
