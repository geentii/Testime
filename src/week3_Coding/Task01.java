package week3_Coding;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String word1 = scan.nextLine();

        System.out.print("Type the first word: ");
        String word2 = scan.nextLine();

        System.out.print("Type how many times u want them printed: ");
        int num = scan.nextInt();

        String result = "";


        for(int i = 1; i < num; i++){
                result += word1 + word2;

        }
        result += word1;
        System.out.println(result);
    }
}
