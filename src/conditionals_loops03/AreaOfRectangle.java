package conditionals_loops03;

import java.util.Scanner;

/***
 * Area Of Rectangle Program
 * A = w * l ---> Area = length * width
 */

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length ");
        int length = sc.nextInt();
        System.out.println("Enter the Width ");
        int width = sc.nextInt();

        int area= length * width;

        System.out.println("Total area = " + area);



    }
}
