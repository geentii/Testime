package week3_Coding;

import java.util.Scanner;

public class ArrayTask01 {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the number of a month: ");
            int month = scan.nextInt();


         if(month >= 1 || month <= 12) {
             System.out.println(months[month - 1]);
         }else{
             System.out.println("Invalid number of month");
         }
    }
}

