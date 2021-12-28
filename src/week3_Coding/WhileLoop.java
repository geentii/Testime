package week3_Coding;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = 5;
        int num2 = 10;
        int answer;

        System.out.print("What is " + num1 + " + " + num2 + ": ");
        answer = scan.nextInt();

        int count = 0;
        while(num1 + num2 != answer){
            if(count == 2){
                System.out.println("Focus!!!!");
            }
            System.out.print("Wrong answer, try again," + num1 + " + " + num2 + " =");
            answer = scan.nextInt();
            count++;
        }
        System.out.println("Congratz, u got it right");
    }
}
