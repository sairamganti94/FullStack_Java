You are given a character string A, having length N and an integer ASCII code B.

You have to tell the leftmost occurrence of the character having ASCII code equal to B, in A or report that it does not exist.
  

 public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final String A, final int B) {
        for(int i =0;i<A.length();i++)
        {
            char ch = A.charAt(i);
            if(ch == B)
            {
                return i;
            }
            
        }
        return -1;
    }
}
