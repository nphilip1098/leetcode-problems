import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidswithgreatestcandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for(int i = 0;i<candies.length;i++){
            int temp = candies[i]+extraCandies;
            int counter = 0;
            for(int j = 0;j<candies.length;j++){
                if(temp>=candies[j]){
                    counter++;
                }
            }
            if(counter == candies.length){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}

// T(n) -> O(n^2)
