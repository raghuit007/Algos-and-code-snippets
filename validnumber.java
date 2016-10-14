/*
Validate if a given string is numeric.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true

Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one. 

*/

public class Solution {
    public boolean isNumber(String s) {
       
       int count=0,temp=0;
       
       for (int i=0;i<s.length();i++) {
           if ((Character.isLetter(s.charAt(i)) && i==0)) {
               return false;
           }
          // if (count>0 && temp==0 && s.charAt(i)=='.'
           if (Character.isLetter(s.charAt(i)) && temp > 0) {
               return false;
           }
           else if (s.charAt(i)==' ') {
               continue;
           }
           else if ((s.charAt(i)=='.' || s.charAt(i)=='e') && count>0 && temp <2 )
           {
               temp++;
           }
           else {
               count++;
               continue;
           }
       }
        if (count==0) return false;
        return true;
    }
}
