
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
           if(head == null || head.next == null || k == 0)
            return head;
          
            int n=1;
            ListNode last=head;
            while(last.next!=null){
                n++;
                last=last.next;
            }
            k=k%n;
            if(k==0)return head;
            int c=n-k;
            ListNode t=head;
            int count=1;
            while(t!=null){
                if(count==c)break;
                count++;
                t=t.next;
            }
            last.next=head;
            ListNode res=t.next;
            t.next=null;
            return res;


    }
}