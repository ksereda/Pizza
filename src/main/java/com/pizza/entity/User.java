package com.Pizza.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
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

    public User() {
    }

    public User(Order order, Role role, String firstName, String lastName, String login, String password, String mail, String phone) {
        this.order = order;
        this.role = role;
        this.firstName = firstName;
        LastName = lastName;
        this.login = login;
        this.password = password;
        this.mail = mail;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", order=" + order +
                ", role=" + role +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
