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
