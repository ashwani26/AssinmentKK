package first_java02;

import java.util.Scanner;

/***
 * To find out whether the given String is Palindrome or not.
 */
public class CheckItsPalindromOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter the String to check Palifrom :- ");
//        String input = sc.nextLine();
//        checkingPalidrom(input);
        System.out.print("Enter The string to check its Plidrom or Not ");
        int inputInt = sc.nextInt();
        checkingPalidromWithInteger(inputInt);
    }

    static void checkingPalidrom(String inputSring){
        String reverseString = "";
        int length = inputSring.length();
        for (int i = length-1;i >= 0; i--){
            reverseString = reverseString + inputSring.charAt(i);
        }
        if(inputSring.toLowerCase().equals(reverseString.toLowerCase())){
            System.out.print(reverseString + " is a Palidrom");
        }else {
            System.out.print(reverseString + " is not a Palidrom");
        }
    }

    static void checkingPalidromWithInteger(int inputNumber){
        int reverseNumber = 0,remainder;
        while (inputNumber != 0){
            remainder = inputNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            inputNumber /= 10;
        }
        if(inputNumber == reverseNumber){
            System.out.println(inputNumber + " is a Palidrom");
        }else {
            System.out.println(inputNumber + " is not a Palidrom");
        }
    }
}
