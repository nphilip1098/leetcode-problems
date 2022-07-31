import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayformofinteger {
    public static void main(String[] args) {
        int[] num ={9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(num,1));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        long sum = getsum(num);
        long newsum = sum+k;
        int length;
        if((newsum/Math.pow(10, num.length-1)) >= 10){
            length = num.length;
        }
        else{
            length= num.length-1;
        }
        List<Integer> list = new ArrayList<>();
        while(newsum>=0){
            list.add((int) (newsum / Math.pow(10, length)));
            newsum = (int) (newsum%Math.pow(10, length));
            length--;
        }
        return list;
    }
    public static long getsum(int[] arr){
        long sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i]*Math.pow(10, arr.length-1-i);
        }
        return sum;
    }
}
