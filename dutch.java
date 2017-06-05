public class Solution {
    public void sortColors(int[] nums) {
        
        // algorithm
        
        /*
        two passes, first sort all 0s and then sort all 1s
        
         A = {1,1,0,0,2,1,0,1,2}
         
         after iteration 1  : {0,0,0,1,1,2,1,1,2}
         afer iteration 2 : {0,0,0,1,1,1,1,2,2}
         */
         int base=0;
         int n = nums.length-1;
         int p1=0;
         int p2=1;
         
         for (int i=0;i<nums.length;i++) {
             if (nums[i]==p1) {
                 int temp = nums[i];
                 nums[i] = nums[base];
                 nums[base] = temp;
                 base++;
             }
             
         }
         
       //  System.out.println("base is" + base);
         
         while(base<=n) {
            if (nums[base]>nums[n]) {
                int temp = nums[base];
                nums[base] = nums[n];
                nums[n] = temp;
                
            }
            else {
                base++;
                n--;
            }
             
         } 
             
         
         
         
         
         }
        
    }
