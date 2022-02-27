package com.app;
import com.app.domain.Employee;
public class AppShow {

    public static void main(String[] args){//
        System.out.println("Hello My testing confliting");
        Employee emp=getEmployee("Jeff Smith", 30);
        System.out.println(emp.toString());
    }

    public static Employee getEmployee(String name, Integer age){
        return new Employee(name, age);
    }

    public static String getname(Employee emp){
        return emp.getName();
    }
}
