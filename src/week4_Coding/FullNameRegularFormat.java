package week4_Coding;

import java.util.Locale;
import java.util.Scanner;

public class FullNameRegularFormat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = scan.nextLine();

        String firstNameFirstLetter = firstName.substring(0,1).toUpperCase();
        String lastNameFirstLetter = lastName.substring(0,1).toUpperCase();

        String firstNameOthers = firstName.substring(1).toLowerCase();
        String lastNameOthers = lastName.substring(1).toLowerCase();


        System.out.println("" + firstNameFirstLetter + firstNameOthers + " " + lastNameFirstLetter + lastNameOthers);
    }
}
