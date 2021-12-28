package week2_Coding;

public class Tasks {
    public static void main(String[] args) {

        // Task 1
//        int age = 17;
//
//        if(age >= 18){
//            System.out.println("You are eligible to vote");
//        }else{
//            System.out.println("You are not eligible to vote");
//        }


        // Task 2
        int month = 2;

        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has31Days = !has28Days && !has30Days;
//        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

        if (has28Days){
            System.out.println("28 Days");
        }
        if(has30Days){
            System.out.println("30 Days");
        }

        if(has31Days){
            System.out.println("31 Days");
        }




    }
}
