package week4_Coding;

public class CustomMethodsIntro {
    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Gent");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

    }

    public static void printHello5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }

}
