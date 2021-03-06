package week3_Coding;

public class MaximumNumberArray {
    public static void main(String[] args) {

        int[] numbers = {10,5,4,400,50,0,-1};
        int max = numbers[0];
        int min = numbers[0];

        for(int i = 0; i < numbers.length-1; i++){

            int each = numbers[i]; // each: 10,5,4,400,50,0,-1

            if(each > max){ // if any greater number is occurred
                max = each;
            }

            if(each < min){
                min = each;
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
