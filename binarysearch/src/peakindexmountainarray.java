public class peakindexmountainarray {
    public static void main(String[] args) {
        System.out.println(selectpeak(new int[] {0,2,1,0}));
    }

    static int selectpeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int ans=-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            ans = mid;
        }
        return arr[ans];
    }
}


