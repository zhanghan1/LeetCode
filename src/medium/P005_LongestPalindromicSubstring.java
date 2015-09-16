package medium;
/**
 * �ο����� http://www.tuicool.com/articles/eQNfqey
 * @author ZHan
 */
public class P005_LongestPalindromicSubstring {

	/* ����2����̬�滮
	 * ʱ�临�Ӷ�O(n2)���ռ临�Ӷ�O(n2)
	 * ʹ��palin[i][j]��ʾ��i��j�Ƿ��ǻ��Ĵ�
	 * (1)s[i]==s[j]��j-i<=2,��s��i��j�ǻ��Ĵ�
	 * (2)s[i]==s[j]��s��i+1��j-1�ǻ��Ĵ�,��s��i��j�ǻ��Ĵ�
	*/
	public static String longestPalindrome(String s) {
		if (s == null || s.length() == 0)
			return "";
		
		int len = s.length();
		int maxLen = 0;
		boolean[][] palin = new boolean[len][len];
		String result = "";
		for (int i = len - 1; i >= 0; i--) {
			for (int j = i; j < len; j++) {
				if (s.charAt(i) == s.charAt(j) && (j-i<=2 || palin[i+1][j-1] == true)) {
					palin[i][j] = true;
					if (maxLen < j-i+1) {
						maxLen = j-i+1;
						result = s.substring(i,j+1);
					}
				}
			}
		}
		return result;
	}
		
	/*
	 * ����1��
	 * ����˼·�Ƕ���ÿ���Ӵ������ģ�������һ���ַ��������������ַ��ļ�϶��
	 * ���紮abc,���Ŀ�����a,b,c,������ab�ļ�϶��bc�ļ�϶��������ͬʱ����ɨ�裬
	 * ֱ�����ǻ��Ĵ�Ϊֹ��
	 * �����ַ����ĳ���Ϊn,��ô���ĵĸ���Ϊ2*n-1(�ַ���Ϊ������n������϶��n-1������
	 * ����ÿ������������ɨ��ĸ��Ӷ�ΪO(n),
	 * ����ʱ�临�Ӷ�ΪO((2*n-1)*n)=O(n^2),�ռ临�Ӷ�ΪO(1)
	 */
	
//	public static String longestPalindrome(String s) {
//		if (s == null || s.length() == 0)
//			return "";
//		
//		int len = s.length();
//		int maxLen = 0;
//		String result = "";
//		
//		for (int i = 0; i < 2*len - 1; i++) {
//			int left = i/2;
//			int right = i/2;
//			if (i%2==1) {
//				right++;
//			}
//			String str = palindromeSubString(s, left, right);
//			if (maxLen < str.length()) {
//				maxLen = str.length();
//				result = str;
//			}
//		}
//		return result;
//	}
//	
//	public static String palindromeSubString(String s, int left, int right) {
//		while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//			left--;
//			right++;
//		}
//		return s.substring(left+1, right);
//	}
	
	public static void main(String args[]) {
		String s = "aaaabbbaaacde";
		System.out.println(longestPalindrome(s));
	}
}
