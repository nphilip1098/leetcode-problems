import java.util.Arrays;

public class firstandlastpositioninsortedarray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange_bf(new int[] {5,7,7,7,8,8,9},7)));
        System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,7,8,8,9},7)));
    }

    //TC -> O(n)
    //SC -> O(1)
    static int[] searchRange_bf(int[] arr, int target){
        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                res[0] = i;
                break;
            }
        }

        for (int j = arr.length-1; j >=0 ; j--) {
                if(arr[j] == target){
                    res[1] = j;
                    break;
                }
        }
        return res;
    }
    // TC -> O(logn)
    // SC _> O(1)
    static int[] searchRange(int[] arr, int target){
        int[] ans = new int[]{-1,-1};
        ans[0] =  search(arr, target,true);
        ans[1] = search(arr, target, false);
        return ans;
    }

    static int search(int[] arr, int target, boolean findstartindex){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                ans = mid;
                if(findstartindex == true){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
