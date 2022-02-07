package com.company;


import java.util.Scanner;

@FunctionalInterface
interface SiCalc{
    int calc(int p, int r, int t);
}

public class Java11ASQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double f = 0;

        System.out.print("Enter Principal Amount ");
        int p = scanner.nextInt();
        System.out.print("Enter Intrest Rate ");
        int r = scanner.nextInt();
        System.out.print("Time in years ");
        int t = scanner.nextInt();

        SiCalc siCalc = ((p1, r1, t1) -> {
            return ((p1 * r1 * t1) / 100);
        });
        System.out.println("Total intrest is equals "+siCalc.calc(p,r,t));


    }
}
