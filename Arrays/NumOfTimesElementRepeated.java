public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
         //ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i< A.size(); i++){
            int count = 0;
            for(int j = 0; j < A.size(); j++ ){
                if(A.get(j).equals(A.get(i))){
                    count++;
                }
            }
            ans.add(count);
        }

        return ans;
    }
    
}
