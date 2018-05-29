package com.pizza.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beverage")
public class Beverage {

    @Id
    @Column(name = "beverage_id")
    private long id;

    @Column(name = "beverage_name")
    private String name;

    public Beverage() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
