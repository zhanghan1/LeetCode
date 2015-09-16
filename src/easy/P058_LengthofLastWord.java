package easy;

public class P058_LengthofLastWord {

	
	public static int lengthOfLastWord(String s) {
		if("".equals(s.trim()))
			return 0;
		s = s.trim();
		int length = s.length();
		
		int count = 0;
		for(int i = length - 1; i >= 0 && s.charAt(i)!=' ';i--) {
			count++;
		}
		return count;
	}
//	//使用split方法(通过)
//	public static int lengthOfLastWord(String s) {
//		if("".equals(s.trim()))
//			return 0;
//		String[] strArray = s.split(" ");
//		int length = strArray.length;
//		return strArray[length -1].length();
//	}
	
	public static void main(String args[]) {
		System.out.println(lengthOfLastWord("Hello"));
	}
}
