package com.Pizza.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class Beverage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beverage_id")
    private int id;

    @Column(name = "beverage_name")
    private String name;

}
