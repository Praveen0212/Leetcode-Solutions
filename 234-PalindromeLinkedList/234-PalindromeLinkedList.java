// Last updated: 8/12/2026, 9:12:29 AM
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        ListNode next = null;
        ListNode dummy = head;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr = slow ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        while(prev != null){
            if(dummy.val != prev.val){
                return false;
            }
            dummy = dummy.next;
            prev = prev.next;
        }
        return true;
    }
}