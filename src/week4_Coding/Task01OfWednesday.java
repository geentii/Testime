package week4_Coding;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Task01OfWednesday {
    public static void main(String[] args) {

        int[][] array1 = { {1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(array1.length);

        System.out.println(Arrays.deepToString(array1));

        System.out.println(Arrays.toString(array1[1]));

        System.out.println(array1[1][1]);

        for (int i = 0; i < array1.length; i++) {
            int [] each1DArray = array1[i];
            System.out.println(Arrays.toString(each1DArray));
        }

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array1[i].length; j++) {

                System.out.print(array1[i][j]);
            }
        }
    }
}
