package com.example.models;


public class Employees {
    private int id;
    private String name;
    private int age;
    private String workplace;

    public Employees() {

    }

    public Employees(int id, String name, int age, String workplace) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workplace = workplace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return workplace;
    }

    public void setEmail(String email) {
        this.workplace = workplace;
    }
}
