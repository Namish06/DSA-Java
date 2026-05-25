//leetcode problem no.328 odd even linkedlist
//0ms, beats 100%

class OddEven{
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        return head;
        ListNode prev= head;
        ListNode curr= head.next;
        ListNode even= curr;
        while(curr!=null && curr.next!=null)
        {
            prev.next=curr.next;
            prev= prev.next;
            curr.next=prev.next;
            curr= curr.next;
        }
        prev.next=even;
        return head;

    }
}