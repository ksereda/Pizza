package com.Pizza.services;

import com.Pizza.entity.*;
import java.util.List;

public interface ProductService {

    void addProduct(Product product);

    void deleteProduct(Product product);

    void updateProduct(Product product);

    List<Product> getProduct();

    List<Pizza> getPizzaList();

    List<Souse> getSouseList();

    List<Beverage> getBeverageList();

    List<Sushi> getSushiList();

}
