package easy;

import java.util.Stack;

/*
 * ʹ��˫ջ 
 * ˼·��
 * 1.stack���浱ǰ����ֵ
 * 2.minStack����min��ָ
 * 
 * ʹ�õ�ջ
 * ˼·��
 * ��minֵ������ʱ���ȱ���ɵ�min���ٱ����µ�min
 */
public class P155_MinStack {

	//�ⷨ2��ʹ�õ�ջ
	private Stack<Integer> stack = new Stack<>();
	private int min = Integer.MAX_VALUE;
	
	public void push(int x) {
		if (x <= min) {
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}
	
	public void pop() {
		if (stack.peek() == min) {
			stack.pop();
			min = stack.peek();
			stack.pop();
		} else {
			stack.pop();
		}
	}
	
	public int top() {
		return stack.peek();
	}
	
	public int getMin() {
		return min;
	}
//  �ⷨ1��ʹ��˫ջ	
//	private Stack<Integer> stack = new  Stack<>();
//	private Stack<Integer> minStack = new Stack<>();
//	
//	public void push(int x) {
//		if(minStack.isEmpty() || x <= minStack.peek()) {
//			minStack.push(x);
//		}
//		stack.push(x);
//	}
//
//	public void pop() {
//		if(stack.peek().equals(minStack.peek())) {
//			minStack.pop();
//		}
//		stack.pop();
//	}
//
//	public int top() {
//		return stack.peek();
//	}
//
//	public int getMin() {
//		return minStack.peek();
//	}

}
