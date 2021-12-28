package week2_Coding;

public class Ushtrime {
    public static void main(String[] args) {
        String str = "abckd";
        int indexOfK = str.indexOf("k");

        System.out.println(indexOfK);

        if(indexOfK >= 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
}
