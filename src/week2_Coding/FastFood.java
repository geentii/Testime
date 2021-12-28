package week2_Coding;

import java.util.Scanner;

public class FastFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type one of two main orders. Burger meal or Chicken meal:");
        String order = scan.nextLine();

        if(order.equals("burger") || order.equals("chicken")){
            System.out.println("10.0");
        }else if(order.equals("soda")){
            System.out.println("2.0");
        }
    }
}
