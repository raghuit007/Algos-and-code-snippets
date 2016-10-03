/*  Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. 

Algo : iterate through haystack and return appropriate values 
*/


public class Solution {
    public int strStr(String haystack, String needle) {
      for (int i = 0; ; i++) {
    for (int j = 0; ; j++) { //for each i in haystack , check if character in needle matches 
      if (j == needle.length()) return i; //all characters match return i
      if (i + j == haystack.length()) return -1; // doesnt match, end of haystack reached.
      if (needle.charAt(j) != haystack.charAt(i + j)) break; // character doesnt match. goto next char in haystack.
    }
  }
}
}

/* Another approach (takes more time)
 public int strStr(String haystack, String needle) {
        int j=0;
        int index=0;
        int temp=0;
        if (needle.length()==0 ) {
            return 0;
        }
        if (haystack.length()==0) {
            return -1;
        }
        for (int i=0;i<haystack.length();i++) {
            if (haystack.charAt(i) != needle.charAt(j) )
            {
                continue;
            }
            else {
                int count=0;
                temp=i;
                while (j<=needle.length()-1 && temp<=haystack.length()-1 && haystack.charAt(temp) == needle.charAt(j)) {
                    count++;
                    index =i;
                    j++;
                    temp++;
                    if (j==needle.length() && count==needle.length()) {
                        return index;
                        //break;
                    }
                }
                j=0;
            }
        }
        
        return -1;
    }

*/

