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

    @Embedded
    @Column(name = "pizzas_id")
    private int pizzaId;

    @Embedded
    @Column(name = "beverages_id")
    private int beverageId;

    @Embedded
    @Column(name = "souses_id")
    private int souseId;

    @Embedded
    @Column(name = "sushis_id")
    private int sushiId;

}
