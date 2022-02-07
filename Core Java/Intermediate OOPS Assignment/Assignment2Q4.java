package com.company;
abstract class AbstractClass{
    public int a;
    public int b;

    public AbstractClass(){
        System.out.println("Hi, I am a constructor of Abstract class with an Abstract method.");
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    abstract int Sum();
}
abstract class Base1{
    public Base1(){
        System.out.println("Hi, I am a constructor of an Abstract class without any Abstract method");
    }
}
class Derived2 extends AbstractClass{

    @Override
    int Sum() {
        return a+b;
    }
}

class Derived3 extends Base1{

}

public class Assignment2Q4 {
    public static void main(String[] args) {
        Derived2 derived = new Derived2();
        System.out.println("Enter the values of a and b: ");
        derived.setA(20);
        derived.setB(30);

        System.out.println("Values of a and b are: ");
        System.out.print("a = "+derived.getA());
        System.out.println("b = "+derived.getB());

        System.out.println("The sum of a and b are: "+derived.Sum());

        Derived3 derived3 = new Derived3();

    }
}



