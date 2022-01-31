package week7_Coding;

public class Rectangle {

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
            throw new RuntimeException("No Such a Rectangle with length of: " + length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            throw new RuntimeException("No Such a Rectangle with width of: " + width);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
