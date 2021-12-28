package week2_Coding;

import java.util.Scanner;

public class StringsTasks5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = scan.nextLine();

        System.out.println(word.charAt(word.length()-1));

    }
}
