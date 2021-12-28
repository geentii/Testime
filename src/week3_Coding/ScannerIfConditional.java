package week3_Coding;

public class ScannerIfConditional {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "123";
        String str3 = "";

        for(int i = 0; i < str1.length(); i++){
             str3 += "" + str1.charAt(i) + str2.charAt(i);
        }
        System.out.println(str3);
    }
}
