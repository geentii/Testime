package week3_Coding;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();

        System.out.println(days[n-1]);
    }
}
