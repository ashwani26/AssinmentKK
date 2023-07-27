package conditionals_loops03;

import java.util.Scanner;

/***
 * Area Of Rhombus
 * A= (p*q)/2
 */
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Diagonal ");
        double diagonal1 = sc.nextDouble();
        System.out.print("Enter 2st Diagonal ");
        double diagonal2 = sc.nextDouble();

        double totalArea = (diagonal1 * diagonal2)/2;

        System.out.println("Total area of rhombus " + totalArea);
    }
}
