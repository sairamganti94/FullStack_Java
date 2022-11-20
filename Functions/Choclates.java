/*
Alex is fond of chocolates. He has initially A rupees and a single chocolate costs B rupees.

But too many chocolates are not good for health, so Alex will not buy more than C chocolates.

Find the number of chocolates Alex will buy with the money he has.
*/

public class Solution {
    public int solve(int A, int B, int C) {
        if((A/B) > C)
        {
            return C;
        }
        else
        {
            return A/B;
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        
    }

}
