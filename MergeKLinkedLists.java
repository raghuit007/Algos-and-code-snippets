/* Merge K sorted linked lists into a single list */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 /* Approach is to copy all the elements into a COllection, 
 *  sort it and copy it back to the linked list. 
 * Time complexity has to be improved. This ia a naive approach
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       
       //Listnode temp = new ListNode();
       LinkedList<Integer> a= new LinkedList<Integer>();
       
       for(int i=0;i<lists.length;i++) {
           ListNode temp  = lists[i];
           
            while(temp!=null) {
               // System.out.println(temp.val);
                a.add(temp.val);
                temp=temp.next;
            }
       }
        Collections.sort(a);
       //copy all the elements into ListNode linked list.
       if(a.size()==0) { return null; }
       ListNode head = new ListNode(a.get(0));
       ListNode res = head;
       if(head== null) {
           head = new ListNode(a.get(0));
       }
       for(int j=1;j<a.size();j++) {
           
           res.next = new ListNode(a.get(j));
           res=res.next;
           
       }
       res=head;
        
        return res;
       
       
       
     
    }
}
