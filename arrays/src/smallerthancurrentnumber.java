import java.util.Arrays;

public class smallerthancurrentnumber {
    public static void main(String[] args) {
        int[] nums= {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int counter = 0;
            for(int j = 0;j< nums.length;j++){
                if(nums[i]>nums[j]){
                    counter++;
                }
            }
            result[i] = counter;
        }
        return result;
    }
}
