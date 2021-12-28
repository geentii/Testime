package week4_Coding;

public class MethodIntroduction {
    public static void main(String[] args) {
        int shuma1 = sum(120);
        int shuma2 = sum(50);

        int totali = shuma1 + shuma2;
        System.out.println(totali);
    }
    public static int sum(int numriFundit){
        int sum = 0;
        for (int i = 0; i < numriFundit; i++) {
            sum += i;
        }
//        System.out.println(sum);
        return sum;
    }
}
