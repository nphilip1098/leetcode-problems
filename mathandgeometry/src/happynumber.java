import java.util.ArrayList;

public class happynumber {
    public static void main(String[] args) {
        boolean result = isHappy(2);
        System.out.println(result);
    }
    public static boolean isHappy(int n) {
        boolean result = false;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while(n!=1){
            n = sum(n);
            if(list.contains(n)){
                result = false;
                break;
            }
            else{
                list.add(n);
            }

        }
        System.out.println(list);
        if (n == 1){
            result = true;
        }
        return result;
    }

    public static int sum(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum+=Math.pow(digit,2);
            n = n/10;
        }
        return sum;
    }
}
