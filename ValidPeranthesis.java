/*
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.



*/

// Used stack for implementation

public class Solution {
    public boolean isValid(String s) {
        
        int l = s.length();
        if(l==0) {
            return true;
        }
    
        int [] stack = new int[l];
        int top = -1;
        if ((s.charAt(0)== '}' || s.charAt(0)== ')' || s.charAt(0)== ']' ))
           {
            return false;
          }
        
        for (int i=0;i<l;i++) {
            
            
            if (s.charAt(i)== '{' || s.charAt(i)== '(' || s.charAt(i)== '[' ) {
                //++top;
                stack[++top] = s.charAt(i);
            }
            if ((s.charAt(i)== '}' || s.charAt(i)== ')' || s.charAt(i)== ']' )) {
                if (top<0) {
                    return false;
                }
                if (s.charAt(i)== ')' && stack[top]== '(') {
                    
                    top--;
                }
                else if (s.charAt(i)== '}' && stack[top]== '{') {
                    
                    top--;
                }
               else if (s.charAt(i)== ']' && stack[top]== '[' ) {
                    
                    top--;
                }
                else { break ;}
            }
        }
        if (top==-1) {
            return true;
        }
      //  System.out.println(top);
        return false;
        
    }
}
