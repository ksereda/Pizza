package com.pizza.services;

import com.pizza.entity.Pizza;

import java.util.List;

public interface PizzaService {

    List<Pizza> getPizzas();

    void addPizza(Pizza pizza);

    Pizza findByPizzaName(String pizzaName);

    void deletePizza(Pizza pizza);

    void updatePizza(Pizza pizza);
}
