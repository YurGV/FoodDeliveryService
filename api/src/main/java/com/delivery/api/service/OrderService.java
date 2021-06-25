package com.delivery.api.service;


import com.delivery.domain.Client;
import com.delivery.domain.Market;
import com.delivery.domain.Order;
import com.delivery.domain.Product;

import java.util.List;

public interface OrderService {

    Order addOrder(Market market, Client client, Product products);
    Order getOrder(Long id);
    List<Order> getAllOrders();
    void deleteOrder(Long id);
}
