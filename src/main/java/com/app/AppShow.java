package com.app;
<<<<<<< HEAD

import com.app.domain.Employee;

public class AppShow {//
=======
import com.app.domain.Employee;
public class AppShow {
>>>>>>> confltest

    public static void main(String[] args){//
        System.out.println("Hello My testing confliting");
<<<<<<< HEAD
        System.out.println(show("IU890", "Keven"));
    }

    public static Employee show(String id, String name){
        return new Employee(id, name);
=======
        Employee emp=getEmployee("Jeff Smith", 30);
        System.out.println(emp.toString());
    }

    public static Employee getEmployee(String name, Integer age){
        return new Employee(name, age);
    }

    public static String getname(Employee emp){
        return emp.getName();
>>>>>>> confltest
    }
}
