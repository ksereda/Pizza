//package com.Pizza.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "literature")
//public class Literature {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "description")
//    private String description;
//
//    @ManyToOne
//    @JoinColumn(name = "questionId")
//    private Question question;
//
//    public Literature() {
//    }
//
//    public Literature(String description, Question question){
//        this.description = description;
//        this.question = question;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Question getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(Question question) {
//        this.question = question;
//    }
//}
