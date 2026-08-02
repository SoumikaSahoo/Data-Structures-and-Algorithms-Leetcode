class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
  
        ListNode curr = prev.next;
        ListNode tail = curr;      
        ListNode revPrev = null;

        int count = right - left + 1;

        while (count > 0) {
            ListNode next = curr.next;
            curr.next = revPrev;
            revPrev = curr;
            curr = next;
            count--;
        }

        prev.next = revPrev;
        tail.next = curr;

        return dummy.next;
    }
}