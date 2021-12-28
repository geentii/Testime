package week3_Coding;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String original = "AAABBBCCCCDD";

        String nonDuplicates = "";

        for(int i = 0; i<original.length(); i++){
            String currentChar = "" + original.charAt(i);
            if(!nonDuplicates.contains(currentChar)){
                nonDuplicates += currentChar;
            }
        }
        System.out.println(nonDuplicates);
    }
}
