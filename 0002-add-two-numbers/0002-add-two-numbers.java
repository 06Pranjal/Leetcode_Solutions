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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode p1=l1;
        ListNode p2=l2;
        ListNode l3=new ListNode(-1);
        ListNode temp=l3;
        int carry=0;
        
        while(p1!=null || p2!=null){
            ListNode next=new ListNode();
            temp.next=next;
            if(p1==null && p2!=null){
                next.val=0+p2.val+carry;
                carry=0;
                if(next.val>=10){
                carry=next.val/10;
            }
            next.val=next.val%10;
          
            p2=p2.next;
            temp=temp.next;
            }
            else if(p1!=null && p2==null){
                next.val=p1.val+0+carry;
                carry=0;
                if(next.val>=10){
                carry=next.val/10;
            }
            next.val=next.val%10;
          
            p1=p1.next;
            temp=temp.next;
            }
            else{
                next.val=p1.val+p2.val+carry;
                carry=0;
                if(next.val>=10){
                carry=next.val/10;
            }
            next.val=next.val%10;
            p1=p1.next;
            p2=p2.next;
            temp=temp.next;
            }
            
        }

        if(carry>0){
            ListNode last=new ListNode();
            temp.next=last;
            last.val=carry;
        }
        return l3.next;
    }
}