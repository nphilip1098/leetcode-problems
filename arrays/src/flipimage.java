import java.util.Arrays;

public class flipimage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0}};
        image = flipAndInvertImage(image);
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
            }
        }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0;i< image.length;i++){
            image[i] = reverse(image[i]);
            image[i] = invert(image[i]);
        }
        return image;
    }
    public static int[] reverse(int[] arr){
        int temp;
        int st = 0;
        int end = arr.length - 1;
        while(st<end){
            temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        return arr;
    }

    public static int[] invert(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
        }
        return arr;
    }
}
