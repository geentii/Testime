package week3_Coding;

import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {

        int [] num = {2,4,5};

            if(num[0] > num[2]) {
                for (int i = 0; i <= 2; i++) {
                    num[i] = num[0];
                }
            }else{
                for (int i = 0; i <=2 ; i++) {
                    num[i] = num[2];
                }
            }

        System.out.println(Arrays.toString(num));
    }
}
