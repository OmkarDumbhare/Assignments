package com.company;

import java.util.Scanner;
public class StringAssigmentQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int price,total=0;
        int choice=0;
        do {
            System.out.println("1) Insert New Price");
            System.out.println("2) View Purchase Total");
            System.out.println("3) Exit");
            System.out.println("Enter Your Choice: ");
            switch (choice){
                case 1:
                    String s="yes";
                    do {
                        System.out.println("Insert" + (count+1) + "price");
                        price = sc.nextInt();
                        total+=price;
                        System.out.println("Price hase been saved to the file");
                        System.out.println("Do you want to enter price for more items?(Yes/No) ");
                        s = sc.next();
                        count++;
                        System.out.println();
                    }
                    while (s.equalsIgnoreCase("Yes"));
                    break;
                case 2:
                    System.out.println("Total  price of all items is: " + total);
                    break;

                case 3:
                    System.exit(0);
                default:
                    System.out.println("Please enter the correct choice!!!");
                    break;
            }
        }
        while (choice !=3);
    }
}
