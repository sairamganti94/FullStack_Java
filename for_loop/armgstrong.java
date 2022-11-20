import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        int k = 1;
        while(k<N){
            int n = k;
            int ams = 0;
            int m = 0;
            int temp = k;
            while(n!=0){
                m = n%10;
                ams += (m*m*m);
                n /= 10;    
            }
            if(temp==ams)
                System.out.println(ams);
            k++;
        }
    }
}
