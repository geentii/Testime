package week2_Coding;

import java.util.Scanner;

public class StringsTasks8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("First word: ");
        String word1 = scan.nextLine();

        System.out.print("Second word: ");
        String word2 = scan.nextLine();


        if(word1.length() == 3 && word2.length() == 3){
            System.out.println(" " + word1.charAt(0) + word2.charAt(0) +
                   word1.charAt(1) + word2.charAt(1) + word1.charAt(2) + word2.charAt(2));
        }else{
            System.out.println("Cannot merge");
        }


    }
}
