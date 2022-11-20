/*
Given an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

1
1_
1_3
1_3_
1_3_5
*/



import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        int i,j;
        int N = s.nextInt();
        for(i=1;i<=N;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print(" ");
                    
                }
                else
                {
                System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
