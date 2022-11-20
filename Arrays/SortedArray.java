/*Given an array A, check if it is sorted in non decreasing order or not.*/


public class Solution {
    public static int solve(ArrayList<Integer> A) {
        
        for(int i =0;i<=A.size()-2;i++)
        {
            if(A.get(i) > A.get(i+1))
            {
                  return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> sort = new ArrayList<Integer>();
        int N = s.nextInt();
        for(int i =0;i<N;i++)
        {
            sort.add(s.nextInt());
        }
        System.out.print(solve(sort));
    }
}
