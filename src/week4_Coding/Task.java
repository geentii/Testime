package week4_Coding;


public class Task {
    public static void main(String[] args) {
        int n = 4;
        int m = 12;
        CountNumbers(4,12);
    }

    public static void CountNumbers(int from, int to) {
        int result = 1;
        for (int i = from; i < to; i++) {
            result *=i;
        }
        System.out.println(result);
    }
}

