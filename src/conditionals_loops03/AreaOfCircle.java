package conditionals_loops03;

import java.util.Scanner;

/***
 * Area Of Circle Java Program
 * Formula -- A =pie r2  ----> A = (22/7 * r * r)  ---> r is the radius.
 */

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the raddius ");
        double inputRaddius = sc.nextDouble();
        /***
         * raw using of PI
         */
       // double area = (22 * inputRaddius * inputRaddius)/7;
        /***
         * using inbuild Math.PI
         */
        double area = Math.PI * inputRaddius * inputRaddius;
        System.out.println("Area of circle is " + area);

    }
}
