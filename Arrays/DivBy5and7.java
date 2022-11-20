public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
    // Complete function template here
    //Scanner s = new Scanner(System.in);
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for(int i=0;i<arr.size();i++)
    {
        if(arr.get(i)%5 == 0 && arr.get(i)%7 == 0)
         {
              ans.add(arr.get(i));
         }
    }
    return ans;
}
