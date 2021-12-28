package week3_Coding;

    public class ArrayTask02 {
        public static void main(String[] args) {

            int[] nums = {1, -3, 5};
            boolean check = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    check = true;
                }
            }
            System.out.println(check);
        }
    }
