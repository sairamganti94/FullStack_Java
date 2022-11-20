public class Solution {
    public String solve(String A) {
        String lower = "";
        for(int i = 0;i<A.length();i++)
        {
            int ch  = A.charAt(i)+32;
            char upper = (char)ch;
            lower += upper;
        }
        return lower;
    }

}
