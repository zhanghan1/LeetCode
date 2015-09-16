package medium;
/**
 * 
Input:
-2147483648, -1
Output:
-2147483648
Expected:
2147483647
 * @author ZHan
 *
 */
public class P029_DivideTwoIntegers {
	
	public static int divide(int dividend, int divisor) {
		
		int sign = 1;
		if (dividend < 0) {
			sign = -sign;
		}
		if (divisor < 0) {
			sign = -sign;
		}
		
		long n1 = Math.abs((long)dividend);
		long n2 = Math.abs((long)divisor);
		long ans = 0;//用long是为了处理溢出，比如当ans为2147483648的情况
		while (n1 >= n2) {
			long base = n2;
			for (int i = 0; n1 >= base; i++) {
				n1 -= base;
				base<<=1;
				ans+=1<<i;
			}
		}
		
		//处理溢出的情况
		//int的范围为-2147483648到2147483647
		//dividend=Integer.MIN_VALUE,即-2147483648
		//divisor=-1，此时将发生溢出,按题目要求，返回Integer.MAX_VALUE
		if (ans * sign > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		
		return (int) (sign*ans);
	}

	public static void main(String args[]) {
	//	System.out.println(divide(2147483647, 1));
	//	System.out.println(Math.abs((long)Integer.MIN_VALUE));
		System.out.println(divide(-2147483648, -1));
	}
}
