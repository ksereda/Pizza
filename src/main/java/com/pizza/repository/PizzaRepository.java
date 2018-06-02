package com.Pizza.repository;

import com.Pizza.entity.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza, Integer> {

    Pizza findByName(String name);
}
