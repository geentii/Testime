package day01_;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*
     System.out.println( 25 / 2 ); //12
     System.out.println( 25.0 / 2 );
     System.out.println( 25 / 2.0 );
     System.out.println( 25d / 2 );

//     System.out.println( 10 / 0 );

        int a = 100/3; //33
        System.out.println("a = " + a);

        double b = 100/3; // 33.3333.. or 33 or 33.0
        System.out.println("b = " +b); // b = 33 ==> 33.0

        double c = 100.0/3;
        System.out.println("c = " + c);
*/

        int num1 = 20;
        int num2 = 5;

        int result = num1 / num2;
        int remain = num1 % num2;
        System.out.println("10 / 3 = " + 10/3 + " with a remainder of " + 10%3);
        System.out.println(num1 + " divide by " + num2 + " is equal to " + result + " with a remainder of " + remain);

        int num3 = 20;
        int num4 = 9;
        int result2 = num3 / num4;
        int remain2 = num3 % num4;
        System.out.println("20 / 9 = " + 20/9 + " with a remainder of " + 20%9);
        System.out.println(num3 + " divide by " + num4 + " is equal to " + result + " with a remainder of " + remain);




    }
}
