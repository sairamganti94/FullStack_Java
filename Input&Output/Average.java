//  QUESTION :  Given 5 numbers A, B, C, D, E as input. Print the average of these 5 numbers (correct up to 2 decimal places).

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        float A = s.nextFloat();
        float B = s.nextFloat();
        float C = s.nextFloat();
        float D = s.nextFloat();
        float E = s.nextFloat();
        float avg = ((A+B+C+D+E)/5);
        System.out.printf("%.2f",avg);
        
    }
}
  
  
