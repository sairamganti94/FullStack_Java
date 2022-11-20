You will be given a constant string (A).

You have to return another copy of that input string after removing last character from it.
  
 public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String solve(final String A) {
        String str = "";
        for(int i=0;i<A.length()-1;i++)
        {
            char ch = A.charAt(i);
            str = str+ch;
            
        }
        return str;
    }
}
