/* Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

*/ 

public class Solution {
   public int[] plusOne(int[] digits) {
       //parse the arrya from right and if the digit is 9 replace it with 0
       
       // edge cases : [9,9] must return [1,0,0]. [] must return [1]
       
       int len = digits.length;
       for (int i=len-1;i>=0;i--) {
           if (digits[i] < 9 ) {
               digits[i]++;
               return digits;
           }
           digits[i]=0;
       }
       //the below works because all the other numbers add upto 0 and by default java arrays are initialized to 0
       // so if the number is 999 - we need to initialize only 1 at the beginning 
       //and all others are automatically st when initializing. Pretty smart huh!
       
       int [] newResult = new int[len+1];
       newResult[0] =1;
       
       return newResult;
       
      
   }
}
