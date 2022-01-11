package week5_Coding;

public class RectangleObj {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        System.out.println("First Rectangle");
        rectangle1.setInfo(14.5, 20.3);
//        rectangle1.length = 14.5;
//        rectangle1.width = 20.3;
        rectangle1.getInfo();

        System.out.println("--------------------------------");
        System.out.println("Second Rectangle");
        // length = 50, width = 10
        Rectangle rectangle2 = new Rectangle();

        rectangle2.setInfo(50,10);
        rectangle2.getInfo();

    }
}
