package medium;

public class P043_MultiplyStrings {
	
	public static String multiply(String num1, String num2) {
		char[] number1 = num1.toCharArray();
		char[] number2 = num2.toCharArray();
		
		char[] result = new char[num1.length()+num2.length()];
		
		int len1 = num1.length();
		int len2 = num2.length();
		
		int carry = 0;
		for (int i = len1-1; i >= 0; i--) {
			int index = 0;
			for (int j = len2-1; j >= 0; j--) {
				int n1 = num1.charAt(i)-'0';
				int n2 = num2.charAt(j)-'0';
				int temp = n1 * n2 + carry;
				
				result[index] = (char) ((result[index]-'0'+temp)%10);
				carry = (result[index]-'0'+temp)/10;
				index++;
			}
			//不对！！！有超过了10怎么办
			result[index] = (char)(result[index]-'0'+carry);
			index++;
		}
		return new StringBuilder(new String(result)).reverse().toString();
	}
	
	public static void main(String args[]) {
		String s1 = "1";
		String s2 = "1";
		System.out.println(multiply(s1,s2));
	}
}
