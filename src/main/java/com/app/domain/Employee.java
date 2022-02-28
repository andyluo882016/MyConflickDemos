package com.app.domain;

public class Employee {//

    private String id;
    private String name;

    public String getId() {
        return id;

    }

    public String getName() {
        return name;
    }


    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' ;
    }

}
