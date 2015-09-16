package easy;
/**
 * �ѵ㣺����ж����
 * �ҵķ�����
 * temp=num(��num��ʱ�洢)
 * �����µ�num֮�� 
 * �ж�num/10�Ƿ����temp
 */
public class P008_StringtoInteger_atoi {

	public static int myAtoi(String str) {		
		str = str.trim();
		if(str.startsWith("+-") || str.startsWith("-+"))
			return 0;
		boolean isNegative = str.startsWith("-") ? true:false;
		boolean isPositive = str.startsWith("+") ? true:false;
		int length = str.length();
		int start = 0;
		if(isNegative || isPositive) 
			start = 1;
		int num = 0;
		int temp;
		while(start < length) {
			if(!Character.isDigit(str.charAt(start)))
				break;
			temp = num;
			num = num * 10 + (int)(str.charAt(start)-'0');
			if(num/10 != temp) {
				if(!isNegative) {
					return Integer.MAX_VALUE;
				} else {
					return Integer.MIN_VALUE;
				}
			}
			start++;
		}
		return isNegative ? -num:num;
	}
	
	public static void main(String args[]) {
		System.out.println(myAtoi("2147483648"));
	}
}
