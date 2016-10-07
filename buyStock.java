/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:

Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

Example 2:

Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.

Solution is simple o(n) with no extra space. 

logic is , put the initial element of the array as bought price as that is the price on day 1
now parse through the array and when an element is occured that is less than the current bp,
replace the bp (which makes sure that we always buy sock at lowest price). 

if the element next is > bp then just subtract them and get max.

*/

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==0) {
            return 0;
        }
        int bp = prices[0];
        int max_profit =0;
        for (int i=0;i<prices.length-1;i++) {
            if (prices[i+1]<= bp) {
                bp = prices[i+1];
                
            }
            else {
                max_profit = Math.max(max_profit,prices[i+1]-bp);
            }
            
        }
        return max_profit;
    }
}
