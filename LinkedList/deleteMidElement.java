import java.lang.classfile.components.ClassPrinter.ListNode;
//leetcode qno.2095

public class deleteMidElement {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 public ListNode deleteMiddle(ListNode head) {
        ListNode node= head;
        ListNode prev= null;
        int count=1;
        int index;
        if (head == null || head.next == null) {
            return null;
        }

        while(node.next != null){
            count++;
            node= node.next;
        }
        ListNode temp= head;
        index= (count/2);
        if (index == 0) {
            return head.next;
        }
        for(int i=0; i<index; i++){
          prev= temp;
          temp= temp.next;
        }
        prev.next= temp.next;
        return head;

    }
}

