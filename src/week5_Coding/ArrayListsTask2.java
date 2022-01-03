package week5_Coding;

import java.util.ArrayList;

public class ArrayListsTask2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
             result += list.get(i);
        }
        System.out.println(result);



    }
}
