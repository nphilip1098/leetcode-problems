import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twosum(new int[] {2,7,11,15}, 9)));
    }

    public static int[] twosum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                return new int[] {map.get(arr[i]),i};
            }
            else{
                map.put(target - arr[i], i);
            }
        }
        return new int[] {-1,-1};
    }
}
