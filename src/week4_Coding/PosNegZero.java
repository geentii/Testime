package week4_Coding;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = scan.nextInt();
        posNegZero(num);
    }

    public static void posNegZero(int num){

        if(num >0){
            System.out.println("The given number is positive");
        }else if(num < 0){
            System.out.println("The given number is negative");
        }else{
            System.out.println("The given number is zero");
        }
    }
}
