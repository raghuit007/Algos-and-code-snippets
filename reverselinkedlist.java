// reverse a single linked list

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
       ListNode nextNode=null;
       ListNode previous = null;
       ListNode temp = head;
       
       while(temp!=null) {
           nextNode = temp.next;
           temp.next = previous;
           previous=temp;
           temp=nextNode;
       }
       head = previous;
     return head;  
 }
