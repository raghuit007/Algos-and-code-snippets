// program to print index of first unique character in a given string

// if s = "leetcode" return 0. if s="aabcca" return 2

 /* Approach:
 
 *first create an array to store indexes of each character. Initialize it to -1
 * if a character is found, replace the index array element with the index of the main string
 * go thru the second array and find the min
 * use ascii values of characters to make sure that each character is placed in its right bucket.
 
 */
 
 public int firstUniqChar(String s) {
        char[] schar = s.toCharArray();
        int result = schar.length;
        int[] seen = new int[26];
        //-1 => not visited
        //-2 => repeating
        //>=0 => appear once, value is index
        Arrays.fill(seen, -1);
        for(int i = 0; i < schar.length; i++) {
            int index = schar[i]-'a';
            if(seen[index] == -1) seen[index] = i;
            else if(seen[index] >= 0) seen[index] = -2;
        }
        for(int i = 0; i < 26; i++) {
            if(seen[i] >= 0) result = Math.min(result, seen[i]);
        }
        return result == schar.length?-1:result;
    }
