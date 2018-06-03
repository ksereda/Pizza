package com.Pizza.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

//    @OneToMany
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "role_id")
    private Role role;

    @Column(name = "user_first_name")
    private String firstName;

    @Column(name = "user_last_name")
    private String LastName;

    @Column(name = "user_login")
    private String login;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_email")
    private String mail;

    @Column(name = "user_phone")
    private String phone;

}
