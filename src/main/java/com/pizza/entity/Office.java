package com.Pizza.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "offices")
@Getter
@Setter
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "office_id")
    private int id;

    @Column(name = "office_address")
    private String address;

    @Column(name = "office_phone")
    private String phone;

    @Column(name = "office_comment")
    private String comment;

}
