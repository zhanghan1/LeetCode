package easy;

import java.util.Stack;

//{}()[]
//{()[]}
//}][
public class P020_ValidParentheses {
	public static boolean isValid(String s) {

		if(s == null || s.isEmpty())
			return true;
		if(s.length() % 2 == 1)
			return false;
		if(!canBePushed(s.charAt(0)))
			return false;
		Stack<Character> stack = new Stack<Character>();
		stack.push(s.charAt(0));
		
		int index = 1;
		int length = s.length();
		while(!stack.empty()) {
			if(index >= length)
				return false;
			if(match(stack.peek(),s.charAt(index))) {
				stack.pop();
				index++;
			}
			else if(canBePushed(s.charAt(index))) {
				stack.push(s.charAt(index));
				index++;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static boolean canBePushed(char ch) {
		if(ch == ')' || ch == '}' || ch == ']')
			return false;
		return true;
	}
	public static boolean match(char ch1, char ch2) {
		if(ch1 == '(' && ch2 == ')')
			return true;
		if(ch1 == '{' && ch2 == '}')
			return true;
		if(ch1 == '[' && ch2 == ']')
			return true;
		return false;
	}
	
	public static void main(String args[]) {
		String str = "((";
		System.out.println(isValid(str));
	}
}
