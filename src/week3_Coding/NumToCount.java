package week3_Coding;

public class NumToCount {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,2,4,2,5};
        int numToCount = 2;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == numToCount){
                count++;
            }
        }
        System.out.println("numToCount has been found " + count + " times in the array");

    }
}
