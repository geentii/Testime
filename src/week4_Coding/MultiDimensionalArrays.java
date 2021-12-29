package week4_Coding;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][][] array3D = {{{1,2,3},{4,5}}, {{6,6,8},{9,10}}};

        System.out.println(Arrays.deepToString(array3D));

        System.out.println(Arrays.deepToString(array3D[1]));

        System.out.println(Arrays.toString(array3D[0][1]));

        System.out.println((array3D[1][0][2]));

    }
}
