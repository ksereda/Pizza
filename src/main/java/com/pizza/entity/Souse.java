package com.pizza.entity;

import javax.persistence.*;

@Entity
@Table(name = "souses")
public class Souse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "souse_id")
    private int id;

    @Column(name = "souse_name")
    private String name;

    public Souse() {
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
