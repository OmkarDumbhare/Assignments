package com.company;
import java.util.Scanner;

public class ArmstrongNumBetweenRange {
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
        int min =100;
        int max =999;
        for(int i=min;i<=max;i++){
            if(armstrongCheck(i)==true){
                System.out.println(i + " ");
            }
        }
    }
}
