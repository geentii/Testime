package week5_Coding;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        int[] nums =  new int[10]; // size is 10 fixed
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[2]);

        System.out.println("------------------------------");

        ArrayList<Integer> numbers = new ArrayList<Integer>(); // size is 0
        numbers.add(10); // autoboxing, 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(1,15);

        System.out.println(numbers);
        System.out.println(numbers.get(2));

        System.out.println(numbers.size());

        System.out.println("------------------------------");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------------");

        for ( Integer each : numbers ) {
            System.out.println(each);
        }



        System.out.println("------------------------------");
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        System.out.println(array1);

    }
}
