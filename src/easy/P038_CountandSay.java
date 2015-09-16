package easy;

public class P038_CountandSay {

	public static String countAndSay(int n) {
		
		if(n == 1)
			return "1";
		String curr = "1";
		for(int i = 2; i <= n; i++) {
			curr = getNextString(curr);
		}
        return curr;		
    }
	
	public static String getNextString(String s) {
		
		int length = s.length();
		char[] str = new char[length*2];
		int strLength = 0;
		
		char curr = s.charAt(0);
		int count = 1;
		for(int i = 1; i < length; i++) {
			if(s.charAt(i) == s.charAt(i-1)) {
				count++;
			} else {
				str[strLength++] = (char)(count+'0');
				str[strLength++] = curr;
				count = 1;
				curr = s.charAt(i);
			}
		}
		str[strLength++] = (char)(count+'0');
		str[strLength++] = curr;
		
		return new String(str, 0, strLength);
	}
	
	public static void main(String args[]) {
		int n = 20;
		System.out.println(countAndSay(n));
	}
}
