package com.Pizza.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
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

}
