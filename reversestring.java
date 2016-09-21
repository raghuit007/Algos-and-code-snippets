Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

// Edge cases covered

public class Solution {
    public int reverse(int x) {
     int sign=x<0?-1:1; //for +ve and -ve numbers
            x=Math.abs(x);
	    long r=0;
	    for ( ; x>0; x=x/10) {
	    	r= r*10+x%10;
	    	if (r>Integer.MAX_VALUE)
	    	    return 0;
	    }
	    return (int)r*sign;
    }
    
}

