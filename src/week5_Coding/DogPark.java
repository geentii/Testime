package week5_Coding;

public class DogPark {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Murat";
        dog1.gender = "FeMale";
        dog1.breed = "Kangal";
        dog1.age = 5;
        dog1.size = "large";
        dog1.color = "yellowish brown";

        System.out.println("Name: " + dog1.name);
        System.out.println("Gender: " + dog1.gender);
        System.out.println("Breed: " + dog1.breed);
        System.out.println("Size: " +dog1.size);
        System.out.println("Age: "  +dog1.age);
        System.out.println("Color: " + dog1.color);

        Dog dog2 = new Dog();
        dog2.setInfo("Kimbo","German Shepherd", "Male", "White", "Medium", 5);

        Dog dog3 = new Dog();
        dog3.setInfo("Ninja", "Husky", "Female", "Blue","Small", 3);

        dog1.bark();
        dog2.bark();
        dog3.bark();

        System.out.println("---------------------------------------------");

        dog2.eat(" Pizza");
        dog3.eat(" Pasta");
        dog1.eat(" Meat");

        System.out.println("---------------------------------------------");

        dog1.drink("Water");
        dog2.drink("CocaCola");
        dog3.drink("Pepsi");


    }
}
