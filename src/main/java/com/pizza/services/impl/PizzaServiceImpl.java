package com.Pizza.services.impl;

import com.Pizza.entity.Pizza;
import com.Pizza.repository.PizzaRepository;
import com.Pizza.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public List<Pizza> getPizzas() {
        List<Pizza> testList = new ArrayList<>();
        Iterator<Pizza> iterator = pizzaRepository.findAll().iterator();
        while(iterator.hasNext())
            testList.add(iterator.next());
        return testList;
    }

    @Override
    public void addPizza(Pizza pizza) {
        pizzaRepository.save(pizza);
    }

    @Override
    public Pizza findByPizzaName(String pizzaName) {
        return pizzaRepository.findByName(pizzaName);
    }

    @Override
    public void deletePizza(Pizza pizza) {
        pizzaRepository.delete(pizza);
    }

    @Override
    public void updatePizza(Pizza pizza) {
        Pizza tempPizza = pizzaRepository.findOne(pizza.getId());
        if (tempPizza != null){
            pizza.setId(tempPizza.getId());
            pizzaRepository.save(pizza);
        }
    }
}
