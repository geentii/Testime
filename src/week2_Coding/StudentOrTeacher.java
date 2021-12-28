package week2_Coding;

import java.util.Scanner;

public class StudentOrTeacher {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Type a name: ");
        String name = scan.nextLine();

        if(name.equals("Chen")){
            System.out.println("Teacher");
        }else{
            System.out.println("Student");
        }



    }
}
