public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
         int r1 = A.length;
        int c1 = A[0].length;

        int r2 = B.length;
        int c2 = B[0].length;
        int[][] out = new int[r1][c2];
        //dimenension of multiplication of resultant  matrix r1 X c2        
        for (int i = 0; i<r1; i++) {
            for (int j = 0; j<c2; j++) {
                int sum = 0;
                for (int k = 0; k<r2; k++) {
                    sum += (A[i][k] * B[k][j]);
                }
                out[i][j] = sum;
            }
        }
        return out;
    }
}
