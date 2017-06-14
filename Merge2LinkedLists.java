/*

merge two sorted linked lists

https://leetcode.com/problems/merge-two-sorted-lists/#/description

*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        
          ListNode dummy = new ListNode(0);
          ListNode current = dummy;
          ListNode temp1 = l1;
          ListNode temp2 = l2;
          
         while (temp1!=null && temp2!=null) { 
          if (temp1.val <= temp2.val) {
              current.next = temp1;
              temp1 = temp1.next;
          }
          else {
              current.next = temp2;
              temp2 = temp2.next;
          }
          
          current = current.next;
         }
          
         while (temp1!=null ) {
             current.next = temp1;
             temp1 = temp1.next;
             current = current.next;
         }
         while (temp2!=null ) {
             current.next = temp2;
             temp2 = temp2.next;
             current = current.next;
         }
        
         return dummy.next;
    
    }
}
