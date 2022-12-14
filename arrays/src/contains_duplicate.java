// Solution in O(n^2)
// Time limit exceeded


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class contains_duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,8,10,9,7,11};
        boolean result= duplicate_check(nums);
        System.out.println(result);
    }
    public static boolean duplicate_check(int[] nums){
        boolean result= false;
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1;j< nums.length;j++){
                if(nums[i] == nums[j]){
                    result = true;
                }
            }
        }
        return result;
    }

    public static boolean duplicate_check_faster(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i< nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
