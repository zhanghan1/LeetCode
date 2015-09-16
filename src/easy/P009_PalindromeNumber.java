package easy;

/*
 * 思路：
 * 将x反转并与x本身做比较
 * 
 * 注：
 * 将x反转时可能会发生溢出，但是这并不影响结果。
 * 将x发生反转发生溢出，说明x不是回文数，应该返回false。
 * 
 */
public class P009_PalindromeNumber {

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		int temp = x;
		int res = 0;
		while (temp != 0) {
			res = res * 10 + temp % 10;
			temp /= 10;
		}
		return x == res;
	}

	public static void main(String args[]) {
		System.out.println(isPalindrome(12121));
	}
}
