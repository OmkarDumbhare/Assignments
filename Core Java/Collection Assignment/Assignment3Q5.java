package com.company;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

class Employee12{
    private String name;
    private int id;

    public Employee12(String name,int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "Employee12{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Assignment3Q5 {
    public static void main(String[] args) {
        Employee12 e1 = new Employee12("Jason",1);
        Employee12 e2 = new Employee12("Gerald",2);
        Employee12 e3 = new Employee12("Tyson",4);

        Map<Employee12,String> hs =new HashMap<>();
        hs.put(e1,"Jason");
        hs.put(e2,"Gerald");
        hs.put(e3,"Tyson");
        System.out.println(hs);
    }
}
