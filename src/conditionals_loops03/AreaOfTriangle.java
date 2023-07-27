package conditionals_loops03;

import java.util.Scanner;

/***
 * Area Of Triangle
 * A = 1/2 hight * base
 */
public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hight ");
        double hight = sc.nextDouble();
        System.out.print("Enter the base ");
        double base = sc.nextDouble();

        double areaOfTrangle = (hight * base)/2;
        System.out.print("Area of Triangle is "  +areaOfTrangle);

    }

}
