package com.Pizza.services;

import com.Pizza.entity.Pizza;
import java.util.List;

public interface PizzaService {

    List<Pizza> getPizzas();

    void addPizza(Pizza pizza);

    Pizza findByPizzaName(String pizzaName);

    void deletePizza(Pizza pizza);

    void updatePizza(Pizza pizza);
}
