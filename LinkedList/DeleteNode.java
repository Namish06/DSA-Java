//leetcode problem 237 delete node in a linkedlist
//without the head pointer given acc to question



class DeleteNode {
    public void deleteNode(ListNode node)
    {
       
        node.val=node.next.val;
        node.next= node.next.next;
     }
}
