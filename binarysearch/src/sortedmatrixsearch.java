import java.util.Arrays;

public class sortedmatrixsearch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(search(new int[][]{{1,2,3},{4,5,6},{7,8,9}},9)));
    }
    public static int[] search(int[][] arr, int target){
        int cstart = 0;
        int cend = arr[0].length -1;
        int midcolumn  = cstart + (cend-cstart)/2;
        int rstart = 0;
        int rend = arr.length-1;

        if(rend == 0){
            binarysearch(arr, 0, 0, cend, target);
        }

        while(rstart<rend-1){
            int mid = rstart + (rend-rstart)/2;
            if(arr[mid][midcolumn] == target){
                return new int[]{mid,midcolumn};
            }
            else if(target>arr[mid][midcolumn]){
                rstart = mid;
            }
            else {
                rend = mid;
            }
        }
        if(arr[rstart][midcolumn] == target){
            return new int[]{rstart,midcolumn};
        }
        else if(arr[rend][midcolumn] == target){
            return new int[] {rstart + 1,midcolumn};
        }

        // First Part
        if(target<arr[rstart][midcolumn]){
            binarysearch(arr,rstart,0,midcolumn - 1,target);
        }
        // Second Part
        else if(target>arr[rstart][midcolumn+1]){
            binarysearch(arr,rstart,midcolumn+1,cend,target);
        }
        // Third Part
        else if(target>arr[rstart+1][midcolumn-1]){
            binarysearch(arr,rstart+1,midcolumn-1,cend,target);
        }
        // Forth Part
        else if(target>arr[rstart+1][midcolumn+1]){
            binarysearch(arr,rstart+1,midcolumn+1,cend,target);
        }

        return new int[]{-1,-1};
    }

    static int[] binarysearch(int[][] arr, int row, int cs, int ce, int target){
        int mid = cs + (ce - cs)/2;
        if(arr[row][mid] == target){
            return new int[]{row,mid};
        }
        else if(arr[row][mid] > target){
            ce = mid-1;
        }
        else{
            cs = mid+1;
        }
        return new int[]{-1,-1};
    }
}
