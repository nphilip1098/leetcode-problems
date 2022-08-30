import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne_bf(new int[] {9})));
        System.out.println(Arrays.toString(plusOne(new int[] {9})));
    }
    // Not the best approach
    public static int[] plusOne_bf(int[] digits) {
        long n = getnumber(digits);
        n = n+1;
        int number_of_digits = (int) Math.log10(n) + 1;
        int result[] = new int[number_of_digits];
        int length = number_of_digits-1;
        int i = 0;
        while(n>0 && i<=length){
            int digit = (int) (n/Math.pow(10,length-i));
            result[i] = digit;
            long x = (long) Math.pow(10, length - i);
            n = (long) (n % x);
            i++;
        }
        return result;
    }

    public static long getnumber(int[] num){
        long number = 0;
        int length = num.length-1;
        for (int i = 0; i < num.length; i++) {
            long v = (long) (num[i] * Math.pow(10, length - i));
            number = number + v;
        }
        return number;
    }
    public static int[] plusOne(int[] nums){
        boolean add = true;
        for(int i = nums.length-1;i>=0;i--){
            if(add){
                nums[i] = nums[i] +1;
                add = false;
            }
            if(nums[i] == 10){
                nums[i] = 0;
                add = true;
            }
        }

        if(add){
            int[] res = new int[nums.length+1];
            res[0] = 1;
            for (int i = 0; i < nums.length; i++) {
                res[i+1] = nums[i];
            }
            return res;
        }
        return nums;

    }
}
