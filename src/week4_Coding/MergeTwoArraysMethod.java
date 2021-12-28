package week4_Coding;

import java.util.Arrays;

public class MergeTwoArraysMethod {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};

        merge(arr1,arr2);

    }

    public static void merge (int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length+arr2.length];

        int i = 0;

        for (int each : arr1) {
            arr3[i++] = each;
        }

        for (int each : arr2){

            arr3[i++] = each;

        }

        System.out.println(Arrays.toString(arr3));

    }
}
