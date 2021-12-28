package week2_Coding;

import java.util.Scanner;

public class OptionMenu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Select one of the 3 Options: ");
        int selected = scan.nextInt();

        if(selected == 1){
            System.out.println("User selected Option 1");
        }
        if(selected == 2){
            System.out.println("User selected Option 2");
        }
        if(selected == 3){
            System.out.println("User selected Option 3");
        }

    }
}
