/*
You are given a positive integer A denoting the radius of a sphere. You have to calculate the volume of the sphere.

Volume of a sphere having radius R is given by (4 * π * R3) / 3.

NOTE: Since, the answer can be a real number, you have to return the ceil value of the volume. Ceil value of a real number X is the smallest integer that is greater than or equal to X.
*/

import java.lang.*;
import java.util.*;
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int A) {
        double volume;
        volume = (4*Math.PI*(A*A*A))/3;
        return (int)(Math.ceil(volume));    
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        //solve(A);
    }
}
