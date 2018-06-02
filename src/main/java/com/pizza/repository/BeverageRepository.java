package com.Pizza.repository;


import com.Pizza.entity.Beverage;
import org.springframework.data.repository.CrudRepository;

public interface BeverageRepository extends CrudRepository<Beverage, Integer> {

    Beverage findByName(String name);
}
