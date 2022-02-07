package com.company;
abstract class Shape5 {
    abstract public String draw();
}
class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return("Rectangle Created");
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
        return ("Line created");
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return ("Cube created");
    }
}

public class Assignment2Q5 {
    public static void main(String[] args) {
        Rectangle5 rect =new Rectangle5();
        Line5 line =new Line5();
        Cube5 cube =new Cube5();

        System.out.println(rect.draw());
        System.out.println(line.draw());
        System.out.println(cube.draw());

    }
}
