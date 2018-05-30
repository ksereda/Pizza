package com.pizza.repository;

import com.pizza.entity.Souse;
import org.springframework.data.repository.CrudRepository;

public interface SouseRepository extends CrudRepository<Souse, Integer> {

    Souse findByName(String name);
}
