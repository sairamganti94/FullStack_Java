/*
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
*/

public class Solution {
    public int solve(int A) {
        int i,j,count=0,flag=0;
        for (i = 1; i <= A; i++) {
 
            // Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0)
                continue;
 
            // flag variable to tell
            // if i is prime or not
            flag = 1;
 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
 
            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                count=count+1;
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
    }
}
