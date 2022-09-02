public class searchinrotatedarray {
    public static void main(String[] args) {
        System.out.println(search(new int[] {1},0));
    }
    public static int search(int[] nums, int target) {
        int pivot = searchpivot(nums);
        if (pivot ==-1){
            searchelement(nums,target,0, nums.length-1);
        }
        else if(nums[pivot] == target){
            return pivot;
        }
        else if(target>nums[0]){
            return(searchelement(nums,target,0,pivot-1));
        }
        else if(target<nums[0]){
            return(searchelement(nums,target,pivot+1, nums.length-1));
        }
        return -1;
    }

    public static int searchpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]>=arr[mid]){
                end = mid-1;
            }
            else if(arr[start]<arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }

    public static int searchelement(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
