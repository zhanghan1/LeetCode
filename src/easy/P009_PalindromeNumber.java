package easy;

/*
 * ˼·��
 * ��x��ת����x�������Ƚ�
 * 
 * ע��
 * ��x��תʱ���ܻᷢ������������Ⲣ��Ӱ������
 * ��x������ת���������˵��x���ǻ�������Ӧ�÷���false��
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
