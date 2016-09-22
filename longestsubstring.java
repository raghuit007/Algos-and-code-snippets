/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. 
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/



public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // declare a linkedhashset(to retain insertion order) that has only uniques
        //parse thru the char array one by one
           //till you encounter a duplicate, keep inserting and increment the count
              // make that count as max
          // once a duplicate is found, flush out the previous elements till the duplicate
          // element and start inserting again
             // keep track of count and do a math.max to always have the max count
     // edge cases : strl.len =0, 
      if (s.length()==0) {
          return 0;
      }
      int max = 0;
      int count = 0;
      Set<Character> hs = new LinkedHashSet<Character>();
      char [] ch = s.toCharArray();
      for (int i=0;i<ch.length;i++) {
        
          if (hs.contains(ch[i])==false )
          {
              hs.add(ch[i]);
              count++;
            
              max = Math.max(count,max);
          }
          else {
              
              for (Iterator<Character> c = hs.iterator(); c.hasNext();) {
                Character temp = c.next();
              
                 if (temp!=ch[i]) {
                      c.remove();
                    count--;
                  
                 }
                 else {
                   
                     c.remove();
                    count--;
                  
                    break;
                 }
             }
              
              hs.add(ch[i]);
              count++;
          }
      }
     
      return max; 
        
    }
}
