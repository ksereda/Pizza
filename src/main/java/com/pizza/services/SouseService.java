package com.Pizza.services;

import com.Pizza.entity.Souse;
import java.util.List;

public interface SouseService {

    List<Souse> getSouse();

    void addSouse(Souse souse);

    Souse findBySouseName(String pizzaName);

    void deleteSouse(Souse souse);

    void updateSouse(Souse souse);
}
