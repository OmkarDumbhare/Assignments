package com.company;
import java.util.Scanner;
class Login{
    String userId = "Ajay",password = "password";
    int loginAttempt=3;
    public String loginUser(String user, String pass) {
        if(user.equals(userId) && pass.equals(password)){
            return "true";
        }
        else {
            return "false";
        }
    }
}
public class Assignment1Q6 {
    public static void main(String[] args) {
        Login login = new Login();
        String userID,password;
        Scanner sc =new Scanner(System.in);
        int loginAttempt=0;
        while (true){
            System.out.println("Enter UserId: ");
            userID= sc.next();
            System.out.println("Enter Password: ");
            password=sc.next();

            String res = login.loginUser(userID,password);
            if(res.equals("true")){
                System.out.println("Welcome "+userID);
                break;
            }
            else {
                loginAttempt++;
                if(loginAttempt==3){
                    System.out.println("You have entered wrong credentials 3 times");
                    System.out.println("Contact Admin");
                    break;
                }
                System.out.println("You have entered wrong credentials ,please enter the right credentials.");
            }
        }
    }
}
