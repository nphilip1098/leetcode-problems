import java.util.Arrays;

import static java.lang.Math.max;

public class highestaltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
        for(int i = 0;i<gain.length;i++){
            altitude[i+1]=altitude[i] + gain[i];
            max = max(max,altitude[i+1]);
        }
        return max;
    }
}

