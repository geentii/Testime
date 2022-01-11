package week6_Coding;

public class BMW extends Car {

    public static boolean isLuxuryBrand = true;

    public BMW(String model, int year, double price, String color, long miles) {
        super("BMW", model, year, price, color, miles);
    }

    @Override
    public void start(){
        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");
    }

}
