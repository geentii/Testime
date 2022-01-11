package week6_Coding;

public class CarShop {
    public static void main(String[] args) {

     Toyota toyota = new Toyota("Camry",2010,25000,"white",21312412);
     toyota.start();

     System.out.println("--------------------------------------------------");

     Tesla tesla = new Tesla("S",2020,223154,"Black",0);
     tesla.start();

     System.out.println("--------------------------------------------------");

     BMW bmw = new BMW("X6",2021,231412,"Green",12000);
     bmw.start();



    }
}
