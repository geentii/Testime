package week4_Coding;

import java.util.Scanner;

public class FirstLetterUppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(generateRandomLowerCaseLetter());
        System.out.println(generateRandomUpperCaseLetter());
        System.out.println(generateRandomDigit());
        System.out.println(generateRandomUpperOrLowerLetter());

    }
    public static char generateRandomChar(char startingPoint, char endingPoint){
        return (char) (startingPoint + Math.random() * (endingPoint - startingPoint + 1));
    }

    public static char generateRandomLowerCaseLetter(){
        return generateRandomChar('a','z');//g
    }

    public static char generateRandomUpperCaseLetter(){
        return generateRandomChar('A','Z');
    }

    public static char generateRandomUpperOrLowerLetter(){
        int num = 0;
        do{
            //92
            num = (int) generateRandomChar('A','z');
            //
            if((num >= 65 && num <= 90) || (num >= 97 && num <= 122)){
                break;
            }
        }while(true);

        return (char)num;
    }

    public static char generateRandomDigit(){
        return generateRandomChar('0','9');
    }

}
