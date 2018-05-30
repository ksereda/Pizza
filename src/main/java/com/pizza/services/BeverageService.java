package com.pizza.services;

import com.pizza.entity.Beverage;

import java.util.List;

public interface BeverageService {

    List<Beverage> getBeverages();

    void addBeverage(Beverage beverage);

    Beverage findByBeverageName(String beverageName);

    void deleteBeverage(Beverage beverage);

    void updateBeverage(Beverage beverage);
}
