package com.Pizza.repository;

import com.Pizza.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {

    Order findByName(String name);

}
