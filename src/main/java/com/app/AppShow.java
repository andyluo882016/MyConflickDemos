package com.app;

import com.app.domain.Employee;

public class AppShow {//

    public static void main(String[] args){
        System.out.println("Hello My testing confliting");
        System.out.println(show("IU890", "Keven"));
    }

    public static Employee show(String id, String name){
        return new Employee(id, name);
    }
}
