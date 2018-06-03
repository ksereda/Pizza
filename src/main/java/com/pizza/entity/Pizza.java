package com.Pizza.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class Pizza implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_id")
    private int id;

    @Column(name = "pizza_name")
    private String name;

}
