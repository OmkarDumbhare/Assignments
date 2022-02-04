package com.company;
import java.util.Scanner;
public class ArmstrongOrNot {
    public static boolean armstrongCheck(int num){
        int n =num;
        int sum=0,d;
        while(n!=0){
            d=n%10;
            sum = sum + d * d * d;
            n= n/10;
        }
        if(sum==num){
            return true;}
        else{
            return false;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a Number: ");
        num = sc.nextInt();

        boolean sum = armstrongCheck(num);
        if(sum==true){
            System.out.println("Armstrong Number!!");
        }
        else{
            System.out.println("Not Armstrong Number!!");
        }
    }
}
