import java.util.Arrays;

public class arrayconcatination {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[2*(nums.length)];
        for (int i = 0; i < result.length; i++) {
            if(i<nums.length){
                result[i]=nums[i];
            }
            else{
                result[i] = nums[i- nums.length];
            }

        }
        return result;
    }

}

// T(n) -> O(n)
// S(n) -> O(2n)
