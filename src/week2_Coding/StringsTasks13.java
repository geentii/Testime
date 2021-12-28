package week2_Coding;

import java.util.Scanner;

public class StringsTasks13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scan.nextLine();

        String stringToCheck = "java";

        if(input.length() >= 4){
            if(input.substring(0,4).equals(stringToCheck)){
                System.out.println(true + " gjendet prej char te pare");
            }else if(input.substring(1,5).equals(stringToCheck)){
                System.out.println(true + " gjendet prej char te dyte");
            }else{
                System.out.println("Je gabim zoteri");
            }
        }else{
            System.out.println(false);
        }
    }
}
