package week2_Coding;

import java.util.Scanner;

public class StringsTasks12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Enter a new Word ");
        String word = scan.next();

        if ((word.startsWith("x") || word.startsWith("X")) && (word.endsWith("x") || (word.endsWith("X")))){
            System.out.println(word.substring(1, word.length()-1));
        }

        else if(word.startsWith("x") || word.startsWith("X")){
            System.out.println(word.substring(1));
        }
        else if(word.endsWith("x") || (word.endsWith("X"))){
            System.out.println(word.substring(0, word.length()-1));
        }
        else {
            System.out.println(word);
        }
    }
}
