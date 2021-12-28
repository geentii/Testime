package week3_Coding;

import java.util.Scanner;

public class ForLoopIntro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0;

        for(int i = 0; i<=10; i++){
            System.out.println("Enter a number: ");
            result += scan.nextInt();
        }
        System.out.println("result = " + result);

    }
}
