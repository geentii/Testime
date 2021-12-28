package week3_Coding;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -21476364; //whatever user enters it will be larger than -21474863648
        // 1

        for(int i = 0; i<5; i++){
            System.out.println("Enter a number: ");
            int n = scan.nextInt();

            if(n > max){ // if the user entered number is greater than the max value
                max = n; // then user entered number will be assigned to max variable
            }
        }
        System.out.println("max = " +max);
    }
}
