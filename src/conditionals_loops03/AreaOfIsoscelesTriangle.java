package conditionals_loops03;

import java.util.Scanner;

/***
 * Area Of Isosceles Triangle
 * fromula -  B/4√((4*a*a)-(b*b)) ] a is the length of same side b is the another side of trangle
 */
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the same side of length ");
        double sameSideOfLength = sc.nextDouble();
        System.out.print("Enter the base side Length ");
        double baseSideLength = sc.nextDouble();
        /***
         * TRYED BELOW BUT NOT WORKING
         */
        //double area = (baseSideLength/4)*((4 * sameSideOfLength * sameSideOfLength) - (baseSideLength * baseSideLength));
        double area = (baseSideLength/4)* Math.sqrt((4 * sameSideOfLength * sameSideOfLength) - (baseSideLength * baseSideLength));

        System.out.println("area is "+ area);
    }
}
