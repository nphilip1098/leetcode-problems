import java.util.Arrays;

public class transposematrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = transpose(mat);
        for(int i = 0;i < result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int result[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}

// T(n) -> O(n^2)
// S(n) -> O(n^2)

// Not an ideal solution
