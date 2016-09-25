/*
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? 
Find all unique quadruplets in the array which gives the sum of target.

Note: The solution set must not contain duplicate quadruplets.

For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]

*/

// time complexity is O(n^3).Not an optimal method, but passes test cases.

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l1 = new ArrayList<List<Integer>>();
         HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
        
        if (nums.length<4) {
            return l1;
        }
        Arrays.sort(nums);
        
        int n = nums.length;
        for (int i=0;i<n-3;i++) {
            
            for (int j=i+1;j<n-2;j++) {
                
                int l = j+1;
                int r = n-1;
                while(l<r) {
                    if (nums[i]+nums[j]+nums[l]+nums[r]==target){
                        List<Integer> l2 = new ArrayList<Integer>();
                        l2.add(nums[i]);
                        l2.add(nums[j]);
                        l2.add(nums[l]);
                        l2.add(nums[r]);
                       hs.add(l2);
                       
                        l++;
                        r--;
                    }
                    else if (nums[i]+nums[j]+nums[l]+nums[r]<target) {
                        l++;
                    }
                    else r--;
                }
                 
                
            }
            
        }
         l1.addAll(hs);
        
        return l1;
        
    }
}
