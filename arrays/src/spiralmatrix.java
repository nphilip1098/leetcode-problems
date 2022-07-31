public class spiralmatrix {
    public static void main(String[] args) {
        spiral(new int[][] {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}});
        System.out.println();
    }
    public static void spiral(int[][] arr){
        int k = 0, l =0, i = 0;
        int m = arr.length;
        int n = arr[0].length;
        while(k<m && l<n){
            for (i = l; i < n; i++) {
                System.out.print(arr[k][i] + " ");
            } k++;

            for (i = k; i < m ; i++) {
                System.out.print(arr[i][n-1] + " ");
            }n--;

            if(k<m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(arr[m - 1][i] + " ");
                }
                m--;
            }
            if(l<n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }
        }
    }
}
