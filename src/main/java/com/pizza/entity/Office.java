package com.pizza.entity;

import javax.persistence.*;

@Entity
@Table(name = "office")
public class Office {
    
    @Id
    @Column(name = "office_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "office_address")
    private String address;

    @Column(name = "office_phone")
    private String phone;

    @Column(name = "office_comment")
    private String comment;

    public Office() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
