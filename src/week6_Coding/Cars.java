package week6_Coding;

public class Cars {
    public static void main(String[] args) {

        Toyota firstToyota = new Toyota("Tozhota", 1994,214.231,"Blue",1232431l);
        System.out.println(firstToyota);

        firstToyota.start();
        firstToyota.drive();

        System.out.println("-----------------------------------------------------------------------------------------");

        BMW firstBmw = new BMW("x5",2015,250.000,"Green",1231412l);
        System.out.println(firstBmw);

        firstBmw.start();
        firstBmw.drive();

        System.out.println("-----------------------------------------------------------------------------------------");

        Tesla firstTesla = new Tesla("New",2020,25000,"Black",12305421l);
        System.out.println(firstTesla);

        firstTesla.start();
        firstTesla.drive();
        firstTesla.autoPilot();


    }
}
