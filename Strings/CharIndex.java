Shivam has a string A of size N containing only lowercase characters. He will update the string by inserting a number after every char which will be the index of that char.

For E.g.: if string is azd then it will be updated as a1z26d4 since index of a is 1, of z is 26 and of d is 4.

You have to tell how the string will look like afterwards,


public class Solution {
    public String solve(String A) {
        String ans="";
        for(int i=0;i<A.length();i++){
            char c = A.charAt(i);   // gives the character
            int x = A.charAt(i) - 'a' +1;  // [a(97) - 97 + 1 = 1]
            String s = Integer.toString(x);  // give the index of char x
            ans += c;
            ans += s;
        }
        return ans;
    }
}
