 public class Solution {
    public int myAtoi(String str) {
 String leftRemoved = str.replaceAll("^\\s+", "");
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        char [] ch = leftRemoved.toCharArray();
        int count =0;
        if(ch.length==0) {
            return 0;
        }
        for (int i=0;i<ch.length;i++) 
          {
              
            if (i==0 && (ch[i]=='+' || ch[i]=='-'))
            {
                continue;
            }
            else 
             {
                 int temp = ch[i];
                 if (temp>=48 && temp<=57) {
                     a1.add(Character.getNumericValue(ch[i]));
                 }
                 else 
                 {
                     break;
                 }
             }
                
                
        }
        
        int size = a1.size();
        if (size==0) {
            return 0;
        }
        int k=size-1;
        long res =0;
        for (int j=0;j<size;j++) 
        {
            res += (a1.get(j) * Math.pow(10,k));
            k--;
        }
        
        if ( ch[0]== '-' && (res == Integer.MAX_VALUE+1 || res>Integer.MAX_VALUE)) 
        {
            res = Integer.MIN_VALUE;
        }
        else if ( ch[0]== '-' && (res <= Integer.MAX_VALUE )) 
        {
            res = -res;
        }
        else if (res>Integer.MAX_VALUE) 
        {
            res = Integer.MAX_VALUE;
        }
        else { }
        
        
        
        
        
        
        
       return (int)res; 
        
    }
    
    // better solution 
    
    int index = 0, sign = 1, total = 0;
    //1. Empty string
    if(str.length() == 0) return 0;

    //2. Remove Spaces
    while(str.charAt(index) == ' ' && index < str.length())
        index ++;

    //3. Handle signs
    if(str.charAt(index) == '+' || str.charAt(index) == '-'){
        sign = str.charAt(index) == '+' ? 1 : -1;
        index ++;
    }
    
    //4. Convert number and avoid overflow
    while(index < str.length()){
        int digit = str.charAt(index) - '0';
        if(digit < 0 || digit > 9) break;

        //check if total will be overflow after 10 times and add digit
        if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        total = 10 * total + digit;
        index ++;
    }
    return total * sign;
