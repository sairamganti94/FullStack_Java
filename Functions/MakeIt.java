/*Given two integers A and B. A represents the count of mangoes and B represent the count of slices of mangoes. Mango can be cut into three slices of mangoes. A glass of mango shake can be formed by two slices of mangoes.

Find the maximum number of glasses of mango shakes you can make with A mangoes and B slices of mangoes initially.
*/

public class Solution {
    public int solve(int A, int B) {
        return (int)((A*3)+B)/2;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
    }
}
