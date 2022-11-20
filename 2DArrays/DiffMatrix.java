/*You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.
*/
public class Solution {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int rOne = s.nextInt();
        int cOne = s.nextInt();
        int rTwo = s.nextInt();
        int cTwo = s.nextInt();
        int [][] diff = new int[rOne][cOne];
        if(rOne == rTwo && cOne == cTwo)
        {
            
        
           for(int i =0;i<rOne;i++)
           {
                 for(int j=0;j<cOne;j++)
               { 
                     diff[i][j] = B[i][j] - A[i][j];
               }
           }
        }
        if(rOne == cOne && rTwo == cTwo)
        {
            //int [][] diff = new int[rOne][cOne];

            for(int i =0;i<rOne;i++)
            {
                for(int j =0;j<cOne;j++)
                {
                    diff[i][j] = A[i][j]-B[i][j];
                }
            }

        }
        return diff;
    }
}
