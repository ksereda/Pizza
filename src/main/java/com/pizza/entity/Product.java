package com.pizza.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "menu")
public class Product {

    @Id
    @Column(name = "product_id")
    private long id;

    private List<Pizza> pizzas;
    private List<Beverage> beverages;
    private List<Souse> souses;
    private List<Sushi> sushis;

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
