package first_java02;

import java.util.Scanner;

public class NumberIsEvenOrOdd {
    //Write a program to print whether a number is even or odd, also take input from the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check evn or odd :-- ");
        int numbers =sc.nextInt();
        evenOrOdd(numbers);
    }
    static void evenOrOdd(int numbers) {
        if (numbers % 2 == 0 ){
            System.out.println(numbers + " is even number.");
        }else {
            System.out.println(numbers + " is odd number.");
        }
    }
}
