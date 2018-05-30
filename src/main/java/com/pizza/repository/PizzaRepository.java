package com.pizza.repository;

import com.pizza.entity.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza, Integer> {

    Pizza findByName(String name);
}
