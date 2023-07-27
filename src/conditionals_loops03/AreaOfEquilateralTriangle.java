package conditionals_loops03;

import java.util.Scanner;

/***
 * Area Of Equilateral Triangle
 * A=3/4 a2 ---> root of 3 also
 */
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Trangle ");
        double sideOfTrangle = sc.nextDouble();

        double areaOfTriangle = (Math.sqrt(3)/4) * (sideOfTrangle * sideOfTrangle);

        System.out.println("Total area of the Equilateral Triangle "+ areaOfTriangle);

    }
}
