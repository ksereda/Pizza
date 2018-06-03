package com.Pizza.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class Souse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "souse_id")
    private int id;

    @Column(name = "souse_name")
    private String name;

}
