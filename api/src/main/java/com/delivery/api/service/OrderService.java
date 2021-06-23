package com.delivery.api.service;

import com.delivery.domain.Market;
import com.delivery.domain.Order;

import java.util.List;

public interface OrderService {

    Order addOrder();
    Order getOrder(Long id);
    List<Order> getAllOrders();
    Order updateOrder(Order editOrder);
    Order findBy();
    void deleteOrder(Long id);
}
