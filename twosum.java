/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/



public class Solution {
    public int[] twoSum(int[] nums, int target) {
       // use a hashmap with the follwoing key-> number value-> list of indices it occurs
       // iterate thru the array again and find the diff between the list current and target
       //check the diff number in the hashmap and get its appropriate values
       
       int res [] = new int [2];
       HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
       ;
       
       for (int i=0;i<nums.length;i++) {
           ArrayList<Integer> a = new ArrayList<Integer>();
           if (hm.containsKey(nums[i])) 
           {
               hm.get(nums[i]).add(i);
           }
           else 
           {
               a.add(i);
               hm.put(nums[i],a);
           }
       }
       
       for (int j=0;j<nums.length;j++) {
           int diff = target - nums[j];
           if (hm.containsKey(diff)) {
               //find other key which is not in the same index
                ArrayList<Integer> temp = hm.get(diff);
                int size = temp.size();
                if (size>1)
                {
                    res[0] = temp.get(0);
                    res[1] = temp.get(1);
                    break;
                }
                else if (size==1 && hm.get(diff).get(0) != j) {
                    res[0] = j;
                    res[1] = hm.get(diff).get(0);
                    break;
                }
                else {
                    continue;
                }
               
           }
       }
         
        return res;
        
    }
}
