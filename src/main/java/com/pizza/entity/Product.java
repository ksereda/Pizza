package com.Pizza.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

//    private List<Pizza> pizzas;
//    private List<Beverage> beverages;
//    private List<Souse> souses;
//    private List<Sushi> sushis;

    @Column(name = "pizzas_id")
    private int pizzaId;

    @Column(name = "beverages_id")
    private int beverageId;

    @Column(name = "souses_id")
    private int souseId;

    @Column(name = "sushis_id")
    private int sushiId;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public int getBeverageId() {
        return beverageId;
    }

    public void setBeverageId(int beverageId) {
        this.beverageId = beverageId;
    }

    public int getSouseId() {
        return souseId;
    }

    public void setSouseId(int souseId) {
        this.souseId = souseId;
    }

    public int getSushiId() {
        return sushiId;
    }

    public void setSushiId(int sushiId) {
        this.sushiId = sushiId;
    }
}
