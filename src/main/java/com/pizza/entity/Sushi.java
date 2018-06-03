package com.Pizza.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sushis")
@Getter
@Setter
public class Sushi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sushi_id")
    private int id;

    @Column(name = "sushi_name")
    private String name;

}
