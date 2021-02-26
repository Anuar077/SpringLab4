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

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ",workplace="+
                '}';
    }
}


