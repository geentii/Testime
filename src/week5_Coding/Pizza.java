package week5_Coding;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public void customOrder(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double startingPrice = (size == 'S')? 10 :(size == 'M') ? 12: 14;
        double priceOfTopping = 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        return startingPrice + priceOfTopping;
    }



}
