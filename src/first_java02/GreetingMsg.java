package first_java02;

import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter the name");
        String message = sc.next();

        System.out.println("You are Perfect " +message + " Keep Learning");
    }
}
