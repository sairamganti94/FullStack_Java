public class Solution {
    public int[] solve(int A, int B, int[][] C) {
    int ans[] = new int[B]; // integer array of size B
    for(int j=0; j<B; j++) { // iterate through columns
       int sum = 0; // reset the value of sum to 0 for each new column
       for(int i=0; i<A; i++) { // iterate through rows
            sum = sum + C[i][j];
        }
       ans[j] = sum;
    }
    return ans;
   }
}
