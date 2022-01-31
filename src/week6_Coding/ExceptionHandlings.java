package week6_Coding;

import javafx.scene.shape.Circle;

import java.util.InputMismatchException;

public class ExceptionHandlings {
    public static void main(String[] args) {

        String str = "Cybertek";


        try{
            System.out.println(str.charAt(200)); // StringIndexOutOfBounds
            System.out.println("Try block");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Catch block: String index out of bound exception occured");
        }

        str += " School";

        System.out.println(str);

        System.out.println("--------------------------------------------------------------");

        try {
            System.out.println(9 / 0); // Arithmetic Exception
        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (RuntimeException e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("--------------------------------------------------------------");

        try { // Plan A
            System.out.println("".substring(10,20)); //"Cybertek"
        }catch (ArithmeticException e){ // Plan B
            e.printStackTrace();
        }catch (NumberFormatException e){ // Plan C
            e.printStackTrace();
        }catch (IllegalArgumentException e){ // Plan D
            e.printStackTrace();
        }catch (InputMismatchException e){ // Plan E
            e.printStackTrace();
        }catch (RuntimeException e){ // Plan F
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("--------------------------------------------------------------");

        Circle circle1 = null;

        try{
            System.out.println( 100/0 );
            System.out.println("Try block");
        }catch (ArithmeticException e){
            System.out.println("Catch block");
        }finally { // gets executed even if the exception is not handled
            System.out.println("Finally block");
        }


        System.out.println("Test completed");

        System.out.println("--------------------------------------------------------------");

        try{
            System.out.println("Cybertek".charAt(-1));
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
            System.exit(0); // To not let the finally block get executed
        }finally {
            System.out.println("Finally block");
        }

    }
}
