package com.pizza.services;

import com.pizza.entity.Souse;

import java.util.List;

public interface SouseService {

    List<Souse> getSouse();

    void addSouse(Souse souse);

    Souse findBySouseName(String pizzaName);

    void deleteSouse(Souse souse);

    void updateSouse(Souse souse);
}
