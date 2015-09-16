package easy;

import java.util.Stack;

/*
 * 使用双栈 
 * 思路：
 * 1.stack保存当前数据值
 * 2.minStack保存min的指
 * 
 * 使用单栈
 * 思路：
 * 当min值做更新时，先保存旧的min，再保存新的min
 */
public class P155_MinStack {

	//解法2：使用单栈
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
//  解法1：使用双栈	
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
