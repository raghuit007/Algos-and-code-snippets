public class Solution {
    public int removeElement(int[] nums, int val) {
        int holder=0;
        for(int i=0;i<nums.length;i++) {
           if(nums[i]==val) {
               int temp=i;
               while(nums[temp]==val && temp<nums.length-1) {
                   //System.out.println(holder++);
                   temp++;
                   
               }
               int swap = nums[i];
               nums[i]=nums[temp];
               nums[temp]=swap;
              // holder++;
           }
           else {
               continue;
           }
           //System.out.println(nums[i]+" "+i);
        }
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=val) {
                holder++;
            }
            else {
                break;
            }
        }
        return holder;
    }
}
