
class Solution {
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);

ListNode curr = head;
        ListNode maxNode = head;
        while(curr!=null && curr.next!=null){
            if(curr.next.val<maxNode.val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
                maxNode=curr;
            }
        }

return reverse(head);


        
    }
         public ListNode reverse(ListNode head) {
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