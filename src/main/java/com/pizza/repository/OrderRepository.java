package com.pizza.repository;

import com.pizza.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {

    Order findByName(String name);

}
