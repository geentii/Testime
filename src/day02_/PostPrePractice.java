package day02_;

public class PostPrePractice {
    public static void main(String[] args) {
        int a = 1;
        a = -a-- + a++ / -a-- * --a; // a = 1 - 1 = 0 + 1 = 1 - 1 = 0 - 1 = -1
        // -1    + 1  /  -1   * -1
        // -1 + 0 * -1
        // -1 + 0
        // -1
        System.out.println("a = " +a);

        int x = 10; //
        x = ++x - x-- + x++ + --x;
        // 11 - 11 + 10 + 10
        // x = 20

        System.out.println("x = " +x);




    }
}
