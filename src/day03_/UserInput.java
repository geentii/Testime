package day03_;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


/*
        System.out.print("Type a number: ");
        int num = scan.nextInt();

        if(num > 0){
            // if body
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }
*/

        /*
        System.out.print("Type the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Type the second number: ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " greater then " +num2);
        }else if(num2 > num1){
            System.out.println(num2 + " is greater then " +num1);
        }else {
            System.out.println(num1 + " Is equal to " +num2);
        }
        */

        System.out.print("Enter the points from the test: ");
        int points = scan.nextInt();

        if(points >= 90){
            System.out.println("Grade A");
        }else if(points >= 75 && points < 90){
            System.out.println("Grade B");
        }else if(points >= 65 && points < 75){
            System.out.println("Grade C");
        }else{
            System.out.println("Perserite vitin");
        }







    }
}
