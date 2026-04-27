import java.lang.classfile.components.ClassPrinter.ListNode;
//leetcode problem no.141 linkedlist cycle
//slow and fast pointer approach
public class LLcycle {
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public boolean hasCycle(ListNode head) {
        
        ListNode fast= head;
        ListNode slow = head;
        if(head==null)
        return false;
        while(slow.next!=null && fast.next!=null && fast.next.next!=null)
        {
            fast= fast.next.next;
            slow= slow.next;
            if(fast==slow)
            return true;
        }
        return false;
     }
}

