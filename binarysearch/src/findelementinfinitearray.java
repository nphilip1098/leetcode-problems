public class findelementinfinitearray {
    public static void main(String[] args) {
        System.out.println(findelement(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},8));
        System.out.println(findelement_ef(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},8));
    }
    // Assuming out of bounds error will never occur

    static int findelement_ef(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            start = end+1;
            end = 2*start +1;
        }
        int ans = search(arr,target,start,end);
        return ans;
    }
    static int findelement(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = 1;
        while(ans == -1) {
            ans = search(arr, target, start, end);
            if (ans == -1) {
                start = end + 1;
                end = 2 * start + 1;
            }
            else{
                return ans;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target, int start,int end){
        while(start<=end){
            int mid = start +(end - start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
                end = end - 1;
            }
        }
        return -1;
    }
}
