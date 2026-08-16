class Solution {
    public boolean isPalindrome(ListNode head) {

        // Create a separate copy
        ListNode copyHead = null;
        ListNode copyTail = null;

        ListNode temp = head;

        while (temp != null) {
            ListNode newNode = new ListNode(temp.val);

            if (copyHead == null) {
                copyHead = newNode;
                copyTail = newNode;
            } else {
                copyTail.next = newNode;
                copyTail = newNode;
            }

            temp = temp.next;
        }

        // Reverse original list
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        // prev is the reversed original list
        ListNode head2 = prev;

        // Compare copy with reversed list
        while (copyHead != null && head2 != null) {

            if (copyHead.val != head2.val) {
                return false;
            }

            copyHead = copyHead.next;
            head2 = head2.next;
        }

        return true;
    }
}