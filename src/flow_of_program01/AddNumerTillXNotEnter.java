package flow_of_program01;

import java.util.Scanner;

public class AddNumerTillXNotEnter {
    public static void main(String[] args) {
        int tolal = 0;
        int number =0;
        int i = 1;
        System.out.print("press any latter to quit or Enter Number " + i + "=");

        /***
         * n*n+1/2
         */
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNextInt()){
            number = sc.nextInt();
            tolal += number;
            i++;
            System.out.print("Enter number " + i + " = ");
        }

        System.out.println("Your total addition is = " + tolal);
    }
}
