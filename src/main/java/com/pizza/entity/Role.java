package com.Pizza.entity;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int id;

    @Column(name = "admin")
    private int admin;

    @Column(name = "customer")
    private int customer;

    @Column(name = "executor")
    private int executor;

    public Role() {
    }

    public Role(int admin, int customer, int executor) {
        this.admin = admin;
        this.customer = customer;
        this.executor = executor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public int getExecutor() {
        return executor;
    }

    public void setExecutor(int executor) {
        this.executor = executor;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", admin=" + admin +
                ", customer=" + customer +
                ", executor=" + executor +
                '}';
    }
}
