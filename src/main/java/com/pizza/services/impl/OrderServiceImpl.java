package com.pizza.services.impl;

import com.pizza.entity.Order;
import com.pizza.repository.OrderRepository;
import com.pizza.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrder() {
        List<Order> ordersList = new ArrayList<>();
        Iterator<Order> iterator = orderRepository.findAll().iterator();
        while (iterator.hasNext())
            ordersList.add(iterator.next());
        return ordersList;
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order findByOrderName(String orderName) {
        return orderRepository.findByName(orderName);
    }

    @Override
    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }

    @Override
    public void updateOrder(Order order) {
        Order tempOrder = orderRepository.findOne(order.getId());
        if (tempOrder != null) {
            order.setId(tempOrder.getId());
            orderRepository.save(order);
        }
    }

}
