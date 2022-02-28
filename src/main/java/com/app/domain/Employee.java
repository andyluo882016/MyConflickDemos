package com.app.domain;

public class Employee {//
<<<<<<< HEAD
    private String id;
    private String name;

    public String getId() {
        return id;
=======
     private String name;
     private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
>>>>>>> confltest
    }

    public String getName() {
        return name;
    }

<<<<<<< HEAD
    public void setId(String id) {
        this.id = id;
    }

=======
>>>>>>> confltest
    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
=======
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Employee(){}
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
>>>>>>> confltest
                '}';
    }
}
