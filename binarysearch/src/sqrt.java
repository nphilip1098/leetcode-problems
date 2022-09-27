public class sqrt {
    public static void main(String[] args) {
        System.out.println(squareroot(2147395599));
    }

    public static int squareroot(int x){
        int start = 1;
        int end = x;

        while(start<=end){
            int mid = start +(end-start)/2;
            int squared = mid*mid;

            if(squared == x){
                return mid;
            }

            else if(squared>x){
                end = mid - 1;
            }
            else {
                start = mid+1;
            }
        }
        return end;
    }
}
