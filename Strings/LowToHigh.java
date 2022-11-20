public class Solution {
    public String solve(String A) {
          String Cap="";
        for(int i=0;i<A.length();i++)
        {
            int ch= A.charAt(i)-32;
            char c=(char)ch;
            Cap+=c;
        }
        return Cap;
    }
}
