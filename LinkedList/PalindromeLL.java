import java.lang.classfile.components.ClassPrinter.ListNode;
//leetcode problem no. 234. Palindrome Linked List (beats 99% 0ms)
public class PalindromeLL {
    
    public boolean isPalindrome(ListNode head) {
        if(head==null && head.next==null)
        return true;
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode nextnode;
        while(slow!=null)
        {
            nextnode= slow.next;
            slow.next=prev;
            prev=slow;
            slow=nextnode;
        }
        while(prev!=null)
        {
            if(head.val!= prev.val)
            return false;
            head=head.next;
            prev=prev.next;
        }

        return true;

        
    }
}

