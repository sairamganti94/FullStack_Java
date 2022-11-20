public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
        int sum = 0;
        for(int i = 0;i<A.size();i++)
        {
            for(int j = 0;j<A.get(0).size();j++)
            {
                if(i == j)
                {
                    sum += A.get(i).get(j);
                }
            }
        }
        return sum;
    }
}
