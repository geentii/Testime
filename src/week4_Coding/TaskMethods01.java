package week4_Coding;

import java.util.Scanner;

public class TaskMethods01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        oddNumbers(15,20);

    }

    public static void oddNumbers(int from, int to){
        for (int i = from; i <= to ; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
