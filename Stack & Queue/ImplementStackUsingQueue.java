//leetcode problem no. 225 implementing stack using queues
//0ms, beats 100% one queue approach


import java.util.*;
class ImplementStackUsingQueue{
    Queue <Integer> q;

    public ImplementStackUsingQueue() {
     q = new LinkedList  <>();
       
    }
    
    public void push(int x) {
         int size = q.size();
        q.add(x);
       for(int i=0;i<size; i++)
        {
            q.add(q.poll());
        }
        
    }
    
    public int pop() {
        int n=q.peek();
        q.poll();
        return n;
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
      return q.isEmpty();  
    }
}

/* Push(x): Insert the element x into the queue. To maintain the stack order:
Run a loop that iterates size() - 1 times, where size() is the current number of elements in the queue.
In each iteration, remove the front element and add it back to the rear of the queue.
This ensures that the most recently added element is always at the front of the queue.
Pop(): Remove and return the front element of the queue, which corresponds to the top of the stack. */

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */