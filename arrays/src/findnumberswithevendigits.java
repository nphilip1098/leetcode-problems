public class findnumberswithevendigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int counter = 0;
        for(int i = 0;i<nums.length;i++){
            int digits = countdigits(nums[i]);
            if(digits%2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static int countdigits(int n){
        int counter = 0;
        while(n>0){
            int digit = n%10;
            counter++;
            n = n/10;
        }
        return counter;
    }
}
