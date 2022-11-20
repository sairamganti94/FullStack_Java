public class Solution {
    public int solve(int[][] A, int[][] B) {
        int flag =1;
        for(int i =0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                if(A[i][j] != B[i][j])
                {
                    flag = 0;
                    break;
                }
            }
        }
        if(flag == 1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
