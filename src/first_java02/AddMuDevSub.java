package first_java02;

import java.util.Scanner;

public class AddMuDevSub {
    //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st number - ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2st number - ");
        int num2 = sc.nextInt();
        System.out.print("Please enter + , - , / ,or * according we perform : - ");
        char op =sc.next().charAt(0);

        addSubMuDiv(num1,num2,op);

    }
    static void addSubMuDiv(int num1,int num2,char op){
        switch (op){
            case '+':
                System.out.println("Addition of " + num1  + " and " + num2 + " is =" + ( num1+ num2));
                break;
            case '-':
                System.out.println("Substraction of " + num1  + " and " + num2 + " is =" +  (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplaction of " + num1  + " and " + num2 + " is =" +  (num1 * num2));
                break;
            case '/':
                System.out.println("Devision of " + num1  + " and " + num2 + " is =" + (num1 / num2));
                break;
            default:
                System.out.println("NOt valid");
        }
    }
}
