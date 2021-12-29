package week4_Coding;

import java.util.Arrays;

public class CodingBatTask {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        oddEven(array1);

    }
    public static void oddEven(int[] arr1){
        int a1 = 0;
        int[] array2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 == 0){
                array2[a1] = arr1[i];
                a1++;
            }
        }
        for (int j = 0; j < arr1.length; j++) {

            if(arr1[j] % 2 != 0){
                array2[a1] = arr1[j];
                a1++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
