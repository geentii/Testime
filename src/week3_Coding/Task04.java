package week3_Coding;

public class Task04 {
    public static void main(String[] args) {

        int [] nums = {1,1,1,2,3,};

        boolean result = false;
        for (int i = 0; i < nums.length - 2; i++) {

            if(nums[i] == nums[i] && nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                result = true;
            }
        }
        System.out.println(result);


    }
}
