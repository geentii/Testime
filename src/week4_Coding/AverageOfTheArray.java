package week4_Coding;

public class AverageOfTheArray {
    public static void main(String[] args) {

        int[] num1 = {1,2,3};
        average(num1);
    }

    public static void average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] ;
        }
        sum = sum/array.length;
        System.out.println(sum);

    }

}

