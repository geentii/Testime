package week4_Coding;

public class CombineChars {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "123";
        combineChars(s1,s2);

    }

    public static void combineChars(String str1, String str2){
        String combined = "";
        for (int i = 0; i < str1.length(); i++) {
        combined += "" + str1.charAt(i) + str2.charAt(i);
        }
        System.out.println(combined);
    }
}
