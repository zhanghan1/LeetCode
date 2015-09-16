package easy;

import java.util.LinkedList;
import java.util.Queue;
/*
 * 参考别人的想法：
 * 使用单个队列实现栈
 * 152ms
 */
public class P225_ImplementStackusingQueues2 {
	
	private Queue<Integer> queue = new LinkedList<>();
	
	// Push element x onto stack.
	public void push(int x) {
		queue.offer(x);
		for (int i = 1; i < queue.size(); i++) {
			queue.offer(queue.poll());
		}
    }

    // Removes the element on top of the stack.
    public void pop() {
    	queue.poll();
    }

    // Get the top element.
    public int top() {
    	return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
    	return queue.isEmpty();
    }
}
