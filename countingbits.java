/*
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].
*/

//uses recurrsive approach. Takes into account the previously calculated values.
public class Solution {
    public int[] countBits(int num) {
        int [] res = new int[num+1];
        res[0] = 0;
        for (int i=1;i<=num;i++) {
            res[i] = res[i/2] + i%2; //this is a brilliant hack. The concept is, since we are dividing by 2,
                                    //the number of 1 bits will be same as the number divided by 2 + the last bit
        }
        return res;
    }
}
