//https://leetcode.com/problems/bulb-switcher/
/*
There are n bulbs that are initially off. You first turn on all the bulbs. 
Then, you turn off every second bulb. On the third round, 
you toggle every third bulb (turning on if it's off or turning off if it's on). 
For the ith round, you toggle every i bulb. 
For the nth round, you only toggle the last bulb. Find how many bulbs are on after n rounds. 
*/

public class Solution {
    public int bulbSwitch(int n) {
        int inp =99;
        
		boolean [] toggleState = new boolean[inp+1];
		int n = toggleState.length;
       // toggleState[0]=true;
        int count=0;
        for(int i=1;i<n-1;i++) {
            int stepper=i;
            while(stepper<n) {
            	//System.out.println(stepper);
            if(toggleState[stepper]==true) {
                toggleState[stepper]=false;
                
                    stepper=stepper+i; 
                }
              
             else {
                toggleState[stepper]=true;
                
                    stepper=stepper+i; 
                
                
             }
            
           }
        }
        if(toggleState[n-1]==true) {
            toggleState[n-1]=false;
        }
        else {
            toggleState[n-1]=true;
        }
        
        for(int j=1;j<n;j++) {
            if(toggleState[j]==true) {
                count++;
            }
        }
        System.out.println(count);
      //return count;  
	}

    }
}
