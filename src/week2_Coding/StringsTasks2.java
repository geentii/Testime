package week2_Coding;

import java.util.Scanner;

public class StringsTasks2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = scan.nextLine();

        if(fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }



    }
}
