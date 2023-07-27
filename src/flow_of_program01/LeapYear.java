package flow_of_program01;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :--> ");
        int input = sc.nextInt();
        //int year = 1900;
        // devide by 100 evenly then also devide by 400 is called leap year
        leapYear(input);

    }

    static void leapYear(int year){
        //int year;
        if((year % 4 == 0) && (year % 100 == 0) || (year % 400 == 0) ){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " Not a leap year");
        }
    }
}
