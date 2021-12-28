package day02_;

public class Tasks {
    public static void main(String[] args) {

       int a = 50;
       a = --a + a++ + a-- + a++;
       // 49 + 49 + 49 + 50
        System.out.println(a);

        int x = 4;
        int y = x * 4 - x++;
        // 4 * 4 - 5
        // 16 - 5
        System.out.println(y);






    }
}
