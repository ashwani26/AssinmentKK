package flow_of_program01;

import java.util.Scanner;

public class AllMathOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number --> ");
        int number1 = sc.nextInt();
        System.out.print("Enter the 2nd number :-->");
        int number2  =sc.nextInt();

        adding(number1,number2);
        multiplication(number1,number2);

    }

    static void adding(int number1 ,int number2){
        int totalSum = number1 + number2;
        System.out.println("Total add is  --> " + totalSum);
    }
    static void multiplication(int number1 ,int number2){
        int totalSum = number1 * number2;
        System.out.println("Total multipiplication is --> " + totalSum);
    }

}
