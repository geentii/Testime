package week3_Coding;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input;
        int sum = 0;

        do{
            System.out.print("Type a number: ");
            input = scan.nextInt();
            sum += input;
        }while(input != 0);
            System.out.println("The sum of numbers u typed is: " +sum);
    }
}
