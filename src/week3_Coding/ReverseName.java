package week3_Coding;

public class ReverseName {
    public static void main(String[] args) {
        String name = "Gent";
//                     0123

        String reverseName = "";

        for(int i = name.length()-1; i>=0; i--){
            reverseName += name.charAt(i);
        }
        System.out.println(reverseName);
    }
}
