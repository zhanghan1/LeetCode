package easy;
/**
 * 注意事项：
 * (1)
 * int的取值范围为
 * Integer.MAX_VALUE = 2147483647(2的31次方减1)
 * Integer.MIN_VALUE = -2147483648(负的2的31次方)
 * (2)
 * 将一个int类型的值反转后，可能后发生溢出 
 * 如何判断是否发生溢出？
 * （注意一定不要转换过后再判断是否发生溢出，
 *  if(px > Integer.MAX_VALUE || px < Integer.MIN_VALUE) return 0;
 *  因为已经发生溢出了，px的指已经是不正确的了）
 *  正确的做法：在将要溢出之前进行判断
 *  if(px > Integer.MAX_VALUE/10 || px < Integer.MIN_VALUE/10) return 0;
 * (3)
 * 如何将一个正常范围内的int值进行反转（包含负数）
 * public static int reverse(int x) {
		int px = 0;
		
		while(x != 0) {
			px = px * 10 + x % 10;
			x = x/10;
		}
		return px;
	}
	上面代码中并未考虑符号的情况，对于负数也同样可用。
 */
public class P007_ReverseInteger {

	public static void main(String args[]) {
		int x = 1534236439;
		System.out.println(reverse(x)+"");
	}
	
	//经典方法
	public static int reverse(int x) {
		int px = 0;
		
		while(x != 0) {
	    	if(px > Integer.MAX_VALUE/10 || px < Integer.MIN_VALUE/10) return 0;
			px = px * 10 + x % 10;
			x = x/10;
		}
	//  不可使用以下方法判断溢出的方法替代上面的判断溢出的方法！	
	//	if(px > Integer.MAX_VALUE || px < Integer.MIN_VALUE) return 0;
		return px;
	}
	
//	//我的解法：转换为字符串，将字符串倒置（符号另作处理）
//	public static int reverse2(int x) {
//		String str = x+"";
//		int start = 0;
//		int end = str.length() - 1;
//		if(str.startsWith("-")) {
//			start = 1;
//		}
//		
//		char[] tempArray = str.toCharArray();
//		while(start != end && start - end != 1) {
//			char temp = tempArray[start];
//			tempArray[start] = tempArray[end];
//			tempArray[end] = temp;
//			start++;
//			end--;
//		}
//		
//		int result = 0;
//		try{
//			result = Integer.parseInt(new String(tempArray));
//		} catch(NumberFormatException e) {
//			
//		}
//		return result;
//	}
}
