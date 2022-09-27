import java.util.Arrays;

public class matrixbinarysearch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(search_bf(new int[][]{{1,2,3},{4,5,6},{7,8,9}},4)));
        System.out.println(Arrays.toString(binary2dsearch(new int[][]{{10,20,30,40},{15,25,35,45},{20,30,37,49},{25,33,45,69}},37)));
    }

    public static int[] search_bf(int[][] arr, int target){
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                     ans[0] = i;
                     ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static int[] binary2dsearch(int[][] arr, int target){
        int r = 0, c = arr[0].length-1;
        while(r<=arr.length && c>=0){
            int search_element = arr[r][c];
            if(target>search_element){
                r++;
            }
            else if(target<search_element){
                c--;
            }
            else if(target == search_element){
                return new int[]{r,c};
            }
        }
        return new int[]{-1,-1};
    }
}
