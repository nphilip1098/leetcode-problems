public class findinmountainarray {
    public static void main(String[] args) {
        System.out.println(findInMountainArray(2,new int[]{1,5,2}));
    }

    static int findInMountainArray(int target, int[] arr){
        int peak = peakfinder(arr);
        int index1 = search(arr,target,0,peak);
        int index2 = search(arr,target,peak, arr.length-1);
        if(index1 == -1){
            return index2;
        } else if (index2 == -1) {
            return index1;
        }
        else{
            return Math.min(index1,index2);
        }
    }

    static int peakfinder(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(start == end){
                return mid;
            }
            if(arr[mid]>arr[mid+1]){
                end = mid;
            } else if (arr[mid]<arr[mid+1]) {
                start = mid+1;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target, int start, int end){
        while(start<=end){
//
//            if(arr[start]<arr[end]) {
//                int mid = start+(end-start)/2;
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else if (target > arr[mid]) {
//                    start = mid + 1;
//                } else {
//                    return mid;
//                }
//            }
                int mid = start+(end-start)/2;
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        return -1;
    }
}
