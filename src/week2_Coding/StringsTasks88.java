package week2_Coding;

import java.util.Scanner;

public class StringsTasks88 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("First word: ");
        String word = scan.nextLine();


        if(word.length() == 5){
            System.out.print("" + word.charAt(word.length()-1) );
            System.out.print("" + word.charAt(word.length()-2) );
            System.out.print("" + word.charAt(word.length()-3) );
            System.out.print("" + word.charAt(word.length()-4) );
            System.out.print("" + word.charAt(word.length()-5) );
        }else if(word.length() >= 0){
            System.out.println("Too long");
        }else{
            System.out.println("Too short");
        }

    }
}
