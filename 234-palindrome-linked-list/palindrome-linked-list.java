
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=reverseList(slow);
        ListNode first =head;
        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;

    }
     private  ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
     next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
        
    }
    return prev;
}
}