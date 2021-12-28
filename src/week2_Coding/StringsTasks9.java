package week2_Coding;

import java.util.Scanner;

public class StringsTasks9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scan.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scan.nextLine();


        if(firstWord.equals(secondWord)){
            System.out.println("The first word is equal to second word");
        }else{
            System.out.println("The first word is not equal to second word");
        }

    }
}
