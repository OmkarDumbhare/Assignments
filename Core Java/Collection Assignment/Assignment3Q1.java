package com.company;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class person12{
    private String name;
    private int height;
    private double weight;

    public person12(String name,int height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
class personlist implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        person12 p1 =(person12) o1;
        person12 p2 =(person12) o2;

        if(p1.getWeight()<p2.getWeight()){
            return -1;
        }
        else if(p1.getWeight()> p2.getWeight()){
            return 1;
        }
        else {
            if (p1.getHeight()<p2.getHeight()){
                return -1;
            }
            else {
                return 1;
            }
        }
    }
}

public class Assignment3Q1 {
    public static void main(String[] args) {
        person12 p1=new person12("Stephen",6,73.0);
        person12 p2=new person12("Justin",6,72.5);
        person12 p3=new person12("Henry",7,62);
        person12 p4=new person12("Erlang",6,63.5);
        person12 p5=new person12("Kevin",6,68.9);
        person12 p6=new person12("Fred",7,65.5);
        person12 p7=new person12("Austin",6,66.6);
        TreeSet<person12> p =new TreeSet<>(new personlist());
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);
        p.add(p7);
        System.out.println("Person in Sorted Order :");
                for(person12 p12 :p){
                    System.out.println(p12);
                }
    }
}
