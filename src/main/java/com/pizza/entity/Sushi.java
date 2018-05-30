package com.pizza.entity;

import javax.persistence.*;

@Entity
@Table(name = "sushis")
public class Sushi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sushi_id")
    private int id;

    @Column(name = "sushi_name")
    private String name;

    public Sushi() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
