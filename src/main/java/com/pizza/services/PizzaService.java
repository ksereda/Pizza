package com.pizza.services;

import com.pizza.entity.Pizza;

import java.util.List;

public interface PizzaService {

    List<Pizza> getPizzas();

    void addPizza(Pizza pizza);

//    List<Pizza> findByTopicId(Integer topicId);

    Pizza findByPizzaName(String pizzaName);

    void deletePizza(Pizza pizza);

//    Pizza findByName(String name);

    void updatePizza(Pizza pizza);
}
