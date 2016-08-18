//find if a linkedlist has a loop 

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
    public boolean hasCycle(ListNode head) {
        boolean result=false;
        ListNode temp = head;
        if (head == null) {
            return false;
        }
        
        return result;
    }/**
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
    public boolean hasCycle(ListNode head) {
       boolean result=false;
        ListNode fast = head;
        ListNode slow = head;
        if (head == null) {
            return false;
        }
        if (head.next==head) {
            return true;
        }
            
        while(slow.next!=null) {
            if(fast.next.next!=null) 
            {
                fast = fast.next.next;
            }
            slow = slow.next;
            if(fast.next==null || fast.next.next==null) {
                break;
            }
            if(slow==fast) {
                result = true;
                break;
            }
                
        }
        return result;
    }
}
}
