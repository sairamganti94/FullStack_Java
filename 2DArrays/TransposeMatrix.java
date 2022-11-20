You are given a matrix A, you have to return another matrix which is the transpose of A.

NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row. The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index, and the element at (j, i)th index to (i, j)th index.
  
  public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<A.get(0).size();i++)
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j=0;j<A.size();j++)
            {
                int val =A.get(j).get(i);
                arr.add(val);
            }
            result.add(arr);
        }
        return result;
    }
}
