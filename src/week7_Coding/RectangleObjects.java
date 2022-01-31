package week7_Coding;

public class RectangleObjects {

    public void method() throws Throwable {
        super.finalize();
        this.finalize(); // clean up
    }


    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(-5, -4);

        System.out.println(r1);

        String str = "Java";
        str = "Python";


    }
}
