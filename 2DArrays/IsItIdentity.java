You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.

Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
        for(int i =0;i<A.size();i++)
        {
            for(int j=0;j<A.get(0).size();j++)
            {
                if(i == j && A.get(i).get(j)!=1)
                {
                   return 0; 
                }
                else if(i!=j && A.get(i).get(j)!=0)
                {
                    return 0;
                }
            }
        }
        return 1;
    }
}
