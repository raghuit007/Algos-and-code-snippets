/* Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

*/

// Straight forward Kadence's algorithm implementation. Covers cases when all elements are nagative as well.
public class Solution {
    public int maxSubArray(int[] nums) {
        int max_curr=0;
        int max_so_far=Integer.MIN_VALUE;
        if (nums.length==1) {
            return nums[0];
        }
        for (int i=0;i<nums.length;i++) {
            max_curr = Math.max(nums[i],nums[i]+max_curr);
            max_so_far = Math.max(max_curr,max_so_far);
        }
        return max_so_far;
    }
}
