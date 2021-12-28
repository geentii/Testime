package week3_Coding;

public class NumsOutput {
    public static void main(String[] args) {

        int [] nums = {100,200,300,400,500};
        int count = 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            System.out.println(count++  + "." + nums[i]);

        }

    }
}
