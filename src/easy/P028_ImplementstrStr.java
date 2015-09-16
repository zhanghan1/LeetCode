package easy;

public class P028_ImplementstrStr {

	public static int strStr(String haystack, String needle) {

		int length = haystack.length();
		int subLength = needle.length();
		boolean isSubString = false;
		int start = 0;
		int i = start;
		int j = 0;
		
		while (j < subLength) {
			if (start + subLength > length) {
				return -1;
			}
			if (haystack.charAt(i) == needle.charAt(j)) {
				i++;
				j++;
			} else {
				start++;
				i = start;
				j = 0;
			}
		}
		return start;
	}
	
	public static void main(String args[]) {
		System.out.println(strStr("abcdefg","cde"));
	}
}
