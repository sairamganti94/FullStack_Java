Given a 2D array A of N rows and M columns. Find value of largest element in each row.
  
public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            int max=A.get(i).get(0);
            for(int j=0;j<A.get(0).size();j++){
                if(max<A.get(i).get(j))
                max=A.get(i).get(j);
            }
           list.add(max);
        }
        return list;
    }
}
