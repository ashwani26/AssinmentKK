package conditionals_loops03;

import java.util.Scanner;

/***
 * Perimeter Of Circle
 * C=2πr --> c - circle ,r - radius
 */
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Redius ");
        double radius = sc.nextDouble();

        double circle = 2*(Math.PI * radius);
        /***
         * without math inbuild method
         */
        double withoutMathUseCircle = 2 * ((22 * radius) / 7);

        System.out.println("Perimeter Of Circle " + circle);

        System.out.println("Perimeter Of Circle2 " + withoutMathUseCircle);
    }
}
