package week2_Coding;

import java.util.Locale;

public class StringsTasks11 {
    public static void main(String[] args) {

        String input = "gent_haxhani@gmail.com";

        String name = "";
        String lastname = "";
        String domain = "";

        int indexOfUnderLine = input.indexOf("_");
        int indexOfAtSign = input.indexOf("@");
        int indexOfDot = input.indexOf(".");

        name = input.substring(0,indexOfUnderLine);
        lastname = input.substring(indexOfUnderLine+1,indexOfAtSign);
        domain = input.substring(indexOfAtSign+1,indexOfDot);


        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1) );
        System.out.println(lastname.substring(0,1).toUpperCase() + lastname.substring(1));
        System.out.println(domain);


    }
}
