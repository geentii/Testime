package week2_Coding;

import java.util.Scanner;

public class StringsTasks10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Type an email: ");
        String email = scan.nextLine();




        if(email.contains("_")){
            int indexOfUnderline = email.indexOf("_");
            int indexOfAtSign = email.indexOf("@");
            String name = email.substring(0,indexOfUnderline);
            String lastName = email.substring((indexOfUnderline+1), indexOfAtSign);
            System.out.println(lastName + "_"+ name + "@gmail.com");
        }else{
            System.out.println(email);
        }

    }
}
