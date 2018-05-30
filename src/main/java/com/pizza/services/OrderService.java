package com.pizza.services;

import com.pizza.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrder();

    void addOrder(Order order);

    Order findByOrderName(String orderName);

    void deleteOrder(Order order);

    void updateOrder(Order order);

}
