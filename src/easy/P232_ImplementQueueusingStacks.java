package easy;

import java.util.Stack;

/*
 * 双栈实现队列 
 * 思路：
 * (1)两个栈，一个用作存储，一个用作转发
 * (2)当入队时，将存储栈中的数据全部转到转发栈中
 *    值入存储栈，再将转发栈中的数据全部转到存储栈中
 *    此时，存储栈的出栈顺序就和入队的顺序是完全一致的
 * (3)出队，得到对头元素，盼空就很简单了
 */
public class P232_ImplementQueueusingStacks {
	
   private Stack<Integer> store = new Stack<>();
   private Stack<Integer> transfer = new Stack<>();
   
   public void push(int x) {
	   while (!store.isEmpty()) {
		   transfer.push(store.pop());
	   }
	   store.push(x);
	   while (!transfer.isEmpty()) {
		   store.push(transfer.pop());
	   }
   }

   // Removes the element from in front of queue.
   public void pop() {
	   store.pop();
   }

   // Get the front element.
   public int peek() {
	   return store.peek();
   }

   // Return whether the queue is empty.
   public boolean empty() {
	   return store.isEmpty();
   }
}
