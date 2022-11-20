You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
  
public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        ArrayList<ArrayList<Integer> > ans = new ArrayList<ArrayList<Integer> >();
        int rows = A.size();
        for(int i =0;i<A.size();i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            ans.add(temp);
            for(int j =0;j<A.get(i).size();j++)
            {
                int ele = A.get(i).get(j);
                ans.get(i).add(ele*B);
            }
        }
        return ans;
    }
}
