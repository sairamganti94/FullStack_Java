/*You are given an integer matrix mat and you have to print the elements of the matrix in wave form (row wise)

See example for clarifications regarding wave print.*/


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = N;
        int mat[][] = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<N;i++){
            if(i%2 == 0) { // Print left to right
                for(int j=0;j<M;j++){
                    System.out.print(mat[i][j] + " ");
                }
            }else { // Print right to left
                for(int j=N-1;j>=0;j--){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
