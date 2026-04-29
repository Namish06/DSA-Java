//leetcode problem number 206 reverse list
public class reverseLL {
    public ListNode reverseList(ListNode head) {
       ListNode nextnode;
        ListNode prev= null;
        ListNode curr= head;
        if(head==null)
        return head;
       while(curr.next!=null)
       {
        nextnode=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextnode;
    }
        curr.next= prev;
        return curr;
        
    }
}
