package week2_Coding;

import java.util.Scanner;

public class duty3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        char f = word.charAt(0);
        String result = "First char is";


        if(f >= '0' && f <= '9'){
            result += "  digit";
        }else if(f >= 'a' && f <= 'z'){
            result += " lowercase";
        }else if(f >= 'A' && f <= 'Z'){
            result += " uppercase";
        }else{
            result += " special character";
        }
        System.out.println(result);
    }
}
