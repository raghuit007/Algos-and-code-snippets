/* Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.

*/

//solution using hashmap and a set 

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int l = s.length();
        if (l==0 || l==1 || s.equals(t)) { return true; }
        int count =0;
        HashMap<Character,Character> hm = new HashMap<Character,Character>(); //for storing mappings
        Set<Character> noDupl = new HashSet<Character>(); // to check for duplicate values in the above hashmap and return false
        for (int i=0;i<l;i++) {
            if (hm.containsKey(s.charAt(i)))
            {
                
                char ch = hm.get(s.charAt(i));
                if (ch != t.charAt(i)) {
                    return false;
                }
            }
            else {
                hm.put(s.charAt(i),t.charAt(i));
                if (noDupl.contains(t.charAt(i))) {
                    return false;
                }
                else { noDupl.add(t.charAt(i)); }
                count++;
            }
        }
        if (count==l) return true;
        return true;
    }
}
