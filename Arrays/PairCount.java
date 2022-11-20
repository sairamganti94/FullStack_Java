/*You are given an integer array A and an integer B.

You are required to return the count of pairs having sum equal to B.

NOTE: pair (i,j) and (j,i) are same.*/
public class Solution {
    public static int solve(int[] A, int B) {
        int i =0;
        int count =0;
        for(i =0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]+A[j]==B)
                {
                    count ++;
                }
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for(int i =0;i<N;i++)
        {
            A[i]=s.nextInt();
        }
        int B = s.nextInt();
        System.out.print(solve(A,B));
    }
}
