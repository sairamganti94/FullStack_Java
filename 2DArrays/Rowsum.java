You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.
  
public class Solution {
    public int[] solve(int[][] A) {
        int ans[] = new int[A.length];
        for(int i =0;i<A.length;i++)
        {
            int sum =0;
            for(int j=0;j<A[i].length;j++)
            {
                sum = sum+ A[i][j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
