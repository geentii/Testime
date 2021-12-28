package week3_Coding;

public class Task03 {
    public static void main(String[] args) {

        int [] nums = {1,1,1,2,3,};

        boolean result = false;
        for (int i = 0; i < nums.length - 2; i++) {

            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                result = true;
            }
        }
        System.out.println(result);
    }
}
