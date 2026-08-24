
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        for(int i=1;i<=(k-1);i++){
            first=first.next;
        }
        ListNode temp=first.next;
        ListNode second =head;
        while(temp!=null){
            temp=temp.next;
            second=second.next;

        }
        int tempvalue=first.val;
        first.val=second.val;
        second.val=tempvalue;
        return head;
    }
}