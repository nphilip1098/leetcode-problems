public class goodnumberpairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
}
