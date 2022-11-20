Problem Description
You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.

NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M), where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.
  
  
import java.util.*;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0;i<A.size();i++)
        {
            int sumofrows = 0;
            for(int j=0;j<A.get(i).size();j++)
            {
                sumofrows +=A.get(i).get(j);
            }
            al.add(sumofrows);
        }
        for(int i=0;i<A.get(0).size();i++)
        {
            int sumofcols = 0;
            for(int j = 0;j<A.size();j++)
            {
                sumofcols += A.get(j).get(i);
            }
            al.add(sumofcols);
        }
        return al;
    }
}
