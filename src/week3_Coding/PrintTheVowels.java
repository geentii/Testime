package week3_Coding;

import java.util.Scanner;

public class PrintTheVowels {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Type a word with vowels: ");
        String word = scan.nextLine();

        String wordWithVowels = "";

        for(int i = 0; i < word.length(); i++){

            char current = word.charAt(i);
            if(current == 'a' || current == 'i' || current == 'e'
            || current == 'o' || current == 'u' || current == 'y'){
                System.out.print(current);
            }
        }
    }
}
