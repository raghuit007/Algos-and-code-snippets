/*
 given a linked list, find the point where the loop begins
 
 do not modify the current LL or take extra space
 
This problem is a tricky problem with the following logic:

suppose 2 pointers are going around a circle with speeds n and 2n, they will first meet at the starting point
given both of them start at the same time. however the fast pointer has a head start, there fore they will meet 
at k nodes before the starting point of loop. The trick is , this k = no of nodes from head till start of the loop.

therefore, when they meet for first time, set the slow pointer to head and move them at same speed  till they meet again.


*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
       // int count =0;
        
        while (slow!=null) {
            if (fast.next== null || fast.next.next== null) {
                return null;
            }
            else if (fast.next.next!= null) {
                fast = fast.next.next;
            }
            slow = slow.next;
            //count++;
            if (slow == fast) {
            slow = head;
            while (slow!=fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
          }
        }
        
      return null;  
    }
}
