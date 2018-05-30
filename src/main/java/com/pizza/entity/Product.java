package com.pizza.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    private List<Pizza> pizzas;
    private List<Beverage> beverages;
    private List<Souse> souses;
    private List<Sushi> sushis;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<Beverage> beverages) {
        this.beverages = beverages;
    }

    public List<Souse> getSouses() {
        return souses;
    }

    public void setSouses(List<Souse> souses) {
        this.souses = souses;
    }

    public List<Sushi> getSushis() {
        return sushis;
    }

    public void setSushis(List<Sushi> sushis) {
        this.sushis = sushis;
    }

}
