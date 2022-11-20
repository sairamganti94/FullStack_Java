public class Solution {
    public long[] solve(int[] A) {
        int N = A.length;
        long[] B = new long[N];
        for(int i =0;i<N;i++)
        {
            long num = (long)A[i];
            B[i] = Math.abs(num*num*num);
                
        }
        return B;
    }
}
