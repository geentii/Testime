package week5_Coding;

public class PrimeNumberTask22 {
    public static void main(String[] args) {

        primeNumber(10);

    }

    public static void primeNumber(int num){
        if(num > 1 && num <= 9 && num % 2 == 0){
            System.out.println(num);
        }else{
            System.out.println("Wrong Number");
        }
    }

}
