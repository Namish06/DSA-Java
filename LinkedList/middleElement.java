//leecode problem no.876
//linkedlist


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
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode node= head;
        int count=1;
        int index;
        while(node.next != null){
            count++;
            node= node.next;
        }
        ListNode temp= head;
         index= (count/2)+1;
            for(int i=0; i<index-1; i++){
          temp= temp.next;
            }
       return temp;
            

          }

    }
