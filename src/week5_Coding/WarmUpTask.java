package week5_Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {

        String[] names = {"Esraa", "Sabir", "Raphael", "Mousa"};
        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList(names));

        Collections.swap(students, 0, students.size() - 1);

        System.out.println(students);

        System.out.println("------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10));

        ArrayList<Integer> uniques = new ArrayList<>(list);
        uniques.removeIf(p -> Collections.frequency(uniques, p) != 1);


        System.out.println(uniques);

        int firstUnique = 0;

        for (Integer each : list) {
            if (Collections.frequency(list, each) == 1) {
                firstUnique = each;
                break;
            }
        }
        System.out.println("firstUnique = " + firstUnique);

        System.out.println("------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10));

        ArrayList<Integer> original = new ArrayList<>(numbers);


//        Collections.sort(numbers); // asc
//        Collections.reverse(numbers); // dsc

        // 5th maximum number:
        int n = 5;
        for (int i = 1; i < n; i++) {
            numbers.removeIf(p -> p == Collections.max(numbers));
        }

        int fifthMaxNumber = Collections.max(numbers);

        System.out.println("original = " + original);
        System.out.println("fifthMaxNumber = " + fifthMaxNumber);

    }
}
