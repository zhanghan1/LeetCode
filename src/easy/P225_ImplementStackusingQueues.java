package easy;

import java.util.LinkedList;
import java.util.Queue;
/*
 * 我的做法：
 * 使用两个队列实现栈 
 * 180ms
 */
public class P225_ImplementStackusingQueues {
	
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();
	private Queue<Integer> store = q1;
	private Queue<Integer> empty = q2;
	// Push element x onto stack.
    public void push(int x) {
    	store.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	while (store.size() != 1) {
			empty.offer(store.poll());
		}
		store.poll();
    	if (store == q1) {
    		store = q2;
    		empty = q1;
    	} else {
    		store = q1;
    		empty = q2;
    	}
    }

    // Get the top element.
    public int top() {
    	while (store.size() != 1) {
			empty.offer(store.poll());
		}
    	int topNum = store.peek();
    	empty.offer(store.poll());
    	if (store == q1) {
    		store = q2;
    		empty = q1;
    	} else {
    		store = q1;
    		empty = q2;
    	}
    	return topNum;
    }

    // Return whether the stack is empty.
    public boolean empty() {
    	return q1.isEmpty() && q2.isEmpty();
    }
}
