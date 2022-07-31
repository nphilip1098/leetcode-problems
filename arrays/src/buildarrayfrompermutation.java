import java.util.ArrayList;
import java.util.Arrays;

public class buildarrayfrompermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] result = buildArray(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
 // T(n) -> O(n)
// S(n) -> O(n)

// Try it in O(1)