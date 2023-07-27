package flow_of_program01;

import java.util.Scanner;

public class HCFandLCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1-- > ");
        int number1 = sc.nextInt();
        System.out.print("Enter the number 2-- > ");
        int number2 = sc.nextInt();

        //hcf(number1,number2);
        lcf(number1,number2);
    }

    static void hcf(int number1,int number2){
        int hcfNumber =0;
        for (int i=1; i<=number1; i++){
            if(number1 % i == 0 && number2 % i == 0 ){
                //System.out.print(i);
                hcfNumber =i;
            }
        }
        System.out.println("HCF of " + number1 + " and " + number2 + " is  = " + hcfNumber);
    }

    static void lcf(int number1,int number2){
        int lcfNumber =0;
        for (int i=1; i<=number1; i++){
            if(number1 % i == 0 && number2 % i == 0 ){
                //System.out.print(i);
                lcfNumber =i;
            }
        }
        int lcm = number1*number2/lcfNumber;
        System.out.println("LCF of " + number1 + " and " + number2 + " is  = " + lcm);
    }
}
