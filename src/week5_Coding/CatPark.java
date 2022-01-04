package week5_Coding;

public class CatPark {
    public static void main(String[] args) {

     Cat cat1 = new Cat();
     Cat cat2 = new Cat();
     Cat cat3 = new Cat();

     cat1.setInfo("Maya", "Grey", "Female", 4, "Tiger");
     cat2.setInfo("Meye", "Blue", "Male", 5, "Tiger");
     cat3.setInfo("Luan", "Green", "Male", 6, "Tiger");

     cat1.jump();
     cat2.jump();
     cat3.jump();


     cat1.breakThings("Sene");
     cat2.breakThings("Ujin");
     cat3.breakThings("Kablla");

    }
}
