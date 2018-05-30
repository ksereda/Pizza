package com.pizza.repository;

import com.pizza.entity.Sushi;
import org.springframework.data.repository.CrudRepository;

public interface SushiRepository extends CrudRepository<Sushi, Integer> {

    Sushi findByName(String name);

}
