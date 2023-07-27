package first_java02;

import java.util.Scanner;

/***
 * To calculate Fibonacci Series up to n numbers.
 */
public class FibonacciSeriesUptoNumberN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number how many number you want to print :- ");
        int number = sc.nextInt();

        fibSeries(number);
    }
    /***
     * n =	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	...
     * xn =	0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	...
     */
    static void fibSeries(int inputNumber){
        int firstNumber = 0;
        int secondNumber= 1;

        for(int i =1;i <= inputNumber;i++){
            System.out.print(firstNumber + ", ");//0

            int nextNumber = firstNumber + secondNumber;//1
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
