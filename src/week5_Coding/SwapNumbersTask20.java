package week5_Coding;

public class SwapNumbersTask20 {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 4;

        System.out.println("num1 = " + num1 + " num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1 + " num2 = " + num2);

    }
}
