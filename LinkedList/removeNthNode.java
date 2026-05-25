//leetcode problem no.19 remove nth node from end of list
//one pass two pointer approach
//0ms, beats 100%
import java.lang.classfile.components.ClassPrinter.ListNode;

public class removeNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode newnode= new ListNode(-1);
    newnode.next= head;
    ListNode slow= newnode, fast=newnode;
    for(int i=0; i<=n; i++)
    fast=fast.next;
    while(fast!=null)
    {
        slow=slow.next;
        fast=fast.next;
    }
    slow.next= slow.next.next;
    return newnode.next;
}
    }
 
    

