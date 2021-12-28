package week2_Coding;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();

        if((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)){
            System.out.println("Medium value is " + num1);
        }else if((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)){
            System.out.println("Medium value is " + num2);
        }else{
            System.out.println("Medium value is " + num3);
        }



    }
}
