package com.company;
import java.util.Scanner;
class ResultDeclaration{
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        double sum = subject1Marks + subject2Marks + subject3Marks;
        if ((sum < 60 || (subject1Marks > 60 && subject2Marks < 60 && subject3Marks < 60)) ||
                (sum < 60 || (subject1Marks < 60 && subject2Marks > 60
                && subject3Marks < 60)) || (sum < 60 || (subject1Marks < 60 && subject2Marks < 60 && subject3Marks > 60))){
            return "failed";
        }
        else if(sum>60 && ((subject1Marks+subject2Marks <=60) && (subject2Marks+subject3Marks <=60) &&
                (subject1Marks+subject3Marks <=60))) {
            return "Promoted";}
        else{
            return "Passed";}
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
        double subject1marks,subject2marks,subject3marks;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks for subject1: ");
        subject1marks =sc.nextDouble();
        System.out.println("Enter the marks for subject2: ");
        subject2marks =sc.nextDouble();
        System.out.println("Enter the marks for subject3: ");
        subject3marks =sc.nextDouble();
        ResultDeclaration resultDeclaration =new ResultDeclaration();
        System.out.println(resultDeclaration.declareResults(subject1marks,subject2marks,subject3marks));
    }
}
