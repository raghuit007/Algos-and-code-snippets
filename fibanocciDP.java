/* You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 

This is basically fibanocci problem disguised in a clever way.

Approach is to use DP with memoization for higher  values

*/

public class Solution {
    public int climbStairs(int n) {
        //simple case of fibanocci
        if (n==1 || n==0) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        List<Integer> l = new ArrayList<Integer>();
        //int j=0;
        l.add(1);
        l.add(2);
        for (int i=3;i<=n;i++) {
            
            l.add(l.get(i-2)+l.get(i-3));
        }
        return l.get(l.size()-1);
}
}
