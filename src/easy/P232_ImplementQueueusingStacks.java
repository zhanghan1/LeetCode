package easy;

import java.util.Stack;

/*
 * ˫ջʵ�ֶ��� 
 * ˼·��
 * (1)����ջ��һ�������洢��һ������ת��
 * (2)�����ʱ�����洢ջ�е�����ȫ��ת��ת��ջ��
 *    ֵ��洢ջ���ٽ�ת��ջ�е�����ȫ��ת���洢ջ��
 *    ��ʱ���洢ջ�ĳ�ջ˳��ͺ���ӵ�˳������ȫһ�µ�
 * (3)���ӣ��õ���ͷԪ�أ��οվͺܼ���
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
