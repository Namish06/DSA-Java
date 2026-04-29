//leetcode problem no.2 add two numbers
//1ms,beats 100%

import java.lang.classfile.components.ClassPrinter.ListNode;

public class addTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
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
        return temp.next;
    }}

