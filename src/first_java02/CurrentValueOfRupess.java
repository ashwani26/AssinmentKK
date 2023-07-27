package first_java02;

import java.util.Scanner;

/***
 * Input currency in rupees and output in USD.
 */
public class CurrentValueOfRupess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much PLN you want to convert Please enter = ");
        double pln = sc.nextDouble();
        System.out.print("Current rate of PLN in INR = ");
        double inr = sc.nextDouble();

        plnToInr(pln,inr);

    }

    static void plnToInr(double currentValueOfPLN,double amountInINR){
        double totalINR =0;
        totalINR = amountInINR * currentValueOfPLN;
        System.out.print("Current Value of  = "+totalINR);

    }
}
