import java.lang.*;
import java.util.*;
public class Solution {
    public int solve(int A) {
        double Area;
        Area = Math.PI*(A*A);
        return (int)(Math.ceil(Area));
    }
public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        //solve(A);
    }
}
