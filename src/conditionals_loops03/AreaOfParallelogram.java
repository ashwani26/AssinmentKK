package conditionals_loops03;

import java.util.Scanner;

/***
 * Area Of Parallelogram
 * Formula --> A = B * H
 */
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base ");
        double base = sc.nextDouble();
        System.out.print("Enter the Hight ");
        double hight  = sc.nextDouble();

        double area = base * hight;
        System.out.print("Total area is Parallelogram " +  area);

    }

}
