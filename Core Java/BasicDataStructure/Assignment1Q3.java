package com.company;
import java.util.Scanner;
class SiCi{
    public double SimpleInterest(double principalAmount,int time,double interestRate){
        double si=0;
        si=(principalAmount*time*interestRate)/100;
        return si;
    }
    public double CompoundInterest(double principalAmount,int time,double interestRate){
        double ci=0;
        ci=(principalAmount * (Math.pow((1+interestRate/100),time))) - principalAmount;
        return ci;
    }
}
public class Assignment1Q3 {
    public static void main(String[] args) {
        SiCi sici =new SiCi();
        double principalAmount,interestAmount;
        int time;
        System.out.println("Enter the prinicipal Amount: ");
        Scanner sc = new Scanner(System.in);
        principalAmount = sc.nextDouble();
        System.out.println("Enter the annual interestRate:");
        interestAmount =sc.nextDouble();
        System.out.println("Enter the time period: ");
        time=sc.nextInt();

        System.out.println("Simple Interest: "+sici.SimpleInterest(principalAmount,time,interestAmount));
        System.out.println("Compound Interest: "+sici.CompoundInterest(principalAmount,time,interestAmount));
    }
}
