package com.pizza.services;

import com.pizza.entity.Basket;

import java.util.List;

public interface BasketService {

    List<Basket> findByOrderId(Integer orderId);

}
