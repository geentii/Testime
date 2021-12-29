package week4_Coding;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {

        int[] array1 = {10,0,5,0,1,0};
        int[] array2 = new int[array1.length];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {

            if(array1[i] != 0){
                array2[count] = array1[i];
                count++;
            }
        }
        for (int j = 0; j < array1.length; j++) {

            if(array1[j] == 0){
                array2[count] = array1[j];
                count++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
