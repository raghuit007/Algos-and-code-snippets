public class Solution {
    public boolean res=false;
    public HashSet<Integer> resultSet = new HashSet<Integer>();
    public boolean getResult(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        int result=0;
        while(n>1) {
            int rem = n%10;
            a.add(rem);
            n=n/10;
            
        }
        a.add(n);
        for(Integer i:a) {
            result +=Math.pow(i,2);
        }
        System.out.println(result);
        if(result==1) {
            res = true;
        }
        else {
            boolean addRes = resultSet.add(result);
            if(addRes==true) {
                getResult(result);
            }
            else {
               // System.out.println("this works");
                res = false;
            }
        }
         return res;   
    }
    
    public boolean isHappy(int n) {
        boolean result = false;
        result = getResult(n);
        return result;
        
    }
}
