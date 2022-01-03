package week5_Coding;

import java.util.ArrayList;

public class ArraysListsTask5 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Prsh");
        words.add("Ckemi");
        words.add("Blleki");
        words.add("Peja");

        words.add(0,"hey");
        words.add(3,"yoo");
        System.out.println(words);

    }
}
