//leetcode problem no. 445 add two numbersII 1ms,beats100% 
//approach reverse the lists and then add
public class addTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        if(l1==null)
        return l2;
        if(l2==null)
        return l1;
        ListNode temp= new ListNode(0);
        ListNode curr=temp;
        int carry=0;
        while(l1!=null || l2!=null ||carry!=0)
        {
            int sum = carry;
            if(l1!=null)
            {
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum=sum+l2.val;
                l2=l2.next;
            }
            curr.next= new ListNode(sum%10);
            carry=sum/10;
            curr=curr.next;
        }
        return reverse(temp.next);

    }
    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode nextnode = curr.next;

            curr.next = prev;

            prev = curr;
            curr = nextnode;
        }

        return prev;
    }
    
    
}

