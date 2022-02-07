package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java11ASQ4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\omkar\\OneDrive\\Documents\\Downloads\\Java11Assignments_StudentList.txt");
        Scanner scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            if (s.length() != 0){
                System.out.println(s.trim());
                count++;
            }
        }
        System.out.println("Total students "+ count);
        scanner.close();

    }
}
