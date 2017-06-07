public class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        /*
         strategy is to return all 4 combinations and check for validity
        
         Alternate strategy includes (hint taken from book)
         
            
        
        */
        List<String> resultIP = new ArrayList<String>();
        if (s.length()<4 && s.length()>12)
        {
            return resultIP;
        }
        
        for (int i=1;i<4 && i<s.length();i++) {
            String s1 = s.substring(0,i);
            if(isValid(s1)) {
                for(int j=1;j<4 && i+j<s.length();j++) {
                    String s2 = s.substring(i,i+j);
                    if(isValid(s2)) {
                        for (int k=1;i+j+k<s.length() && k<4;k++) {
                            String s3 = s.substring(i+j,i+j+k);
                            String s4 = s.substring(i+j+k);
                            if (isValid(s3) && isValid(s4)) {
                                resultIP.add(s1+"."+s2+"."+s3+"."+s4);
                            }
                            
                        }
                    }
                
            }
                
            }
            
        }
        
        
        
         
        return resultIP;
        
    }
    
    public static boolean isValid(String s) {
            if(s.length()>3) {
                return false;
            }
            
            int v = Integer.parseInt(s);
            if(v<=255 && v>=0) {
                return true;
            }
            
            return false;
            
            
        }
}
