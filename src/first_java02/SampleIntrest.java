package first_java02;

import java.util.Scanner;

public class SampleIntrest {
    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the princpal =  ");
        int princpal = sc.nextInt();
        System.out.print("Enter the Time in months = ");
        int time = sc.nextInt();
        System.out.print("Enter the Time in rate = ");
        int rate = sc.nextInt();

        sampleIntrest(princpal,time,rate);
    }

    static void sampleIntrest(int princpal ,int time ,int rate){
        int intrest = (princpal * time  * rate)/100;
        System.out.println(intrest);
    }
}
