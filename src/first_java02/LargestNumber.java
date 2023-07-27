package first_java02;

import java.util.Scanner;

/***
 * Take 2 numbers as input and print the largest number.
 */
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number  = ");
        int number1 = sc.nextInt();
        System.out.print("Enter the 1st number  = ");
        int number2 = sc.nextInt();

        printLargestNumber(number1,number2);

    }

    /***
     * Take two numbers and print the Largest number
     */
    static void printLargestNumber(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("First number is the LARGEST = " + number1);
        } else if (number1 < number2) {
            System.out.println("Second number is the Largest = " + number2);
        }else{
            System.out.print("both are equal");
        }
    }
}
