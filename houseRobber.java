public class Solution {
    public int rob(int[] nums) {
        if (nums.length==0) { return 0; }
        if (nums.length==1) { return nums[0]; }
        if (nums.length==2) { return Math.max(nums[0],nums[1]); }
        int max_profit=0;
        int sum_till_now = nums[0];
        for (int i=2;i<nums.length;i++) {
            sum_till_now =Math.max(sum_till_now,sum_till_now+nums[i]);
            max_profit = Math.max(max_profit,sum_till_now);
           //unfinished
        }
        return max_profit;
    }
}
