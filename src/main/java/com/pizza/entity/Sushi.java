package com.Pizza.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class Sushi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sushi_id")
    private int id;

    @Column(name = "sushi_name")
    private String name;

}
