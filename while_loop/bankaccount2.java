import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        long bal = sc.nextInt();
        int n = sc.nextInt();
       // int type = sc.nextInt();
        int i=1;
        while(i<=n)
        {
            int type = sc.nextInt();
            long amount=sc.nextLong();
            if(type == 1)
            {
                bal = bal+amount;
                System.out.println(bal);
            }
            else if(type == 2)
            {
                if(bal>amount)
                {
                    bal = bal-amount;
                    System.out.println(bal);
                }
                else
                {
                    System.out.println("Insufficient Funds");
                }
            }
            i++;
        }
        
        
    }
}
