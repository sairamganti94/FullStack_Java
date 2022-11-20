/*Write a program to input an integer N and a N*N matrix Mat from user and print the matrix in wave form (column wise)

See example for clarifications regarding wave print.*/

import java.lang.*;
import java.util.*;

public class Main {
    static void wave_print_col_wise(int[][]mat) {
        int N = mat.length; //total number of rows
         int M= mat[0].length; //total number col
       
        for(int j=0; j <M;j++) {
            if(j % 2 == 0) {
                //jth col is even -> top to bottom
                for(int i=0; i < N;i++) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            else {
                //jth col is odd -> bottom to top
                for(int i = N-1; i >= 0;i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
       
        int N = scn.nextInt();
        int M=N;
       
        int[][]mat = new int[N][M];
       
        //scan values and fill mat
        for(int i=0; i < N;i++) {
            for(int j=0; j < M;j++) {
                mat[i][j] = scn.nextInt();
            }
        }
            wave_print_col_wise(mat);

    
    }

}
