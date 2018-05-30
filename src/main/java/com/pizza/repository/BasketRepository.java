package com.pizza.repository;

import com.pizza.entity.Basket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BasketRepository extends CrudRepository<Basket, Integer> {

    List<Basket> findByOrderId(Integer orderId);

}
