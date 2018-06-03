package com.Pizza.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "souses")
@Getter
@Setter
public class Souse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "souse_id")
    private int id;

    @Column(name = "souse_name")
    private String name;

}
