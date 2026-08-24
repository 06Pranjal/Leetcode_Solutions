/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode prev=head;
        ListNode curr=prev.next;
        head=curr;

        while(curr!=null){
            prev.next=curr.next;
            curr.next=prev;
            curr=(prev.next!=null)?prev.next.next:null;
            ListNode temp=prev;
            prev=prev.next;
            if(curr!=null){
                temp.next=curr;
            }
            
        }
        return head;
        
    }
}