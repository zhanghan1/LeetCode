package easy;

/*
 * ������
 * �жϷ������������жϲ���������
 * ���ڲ�����������false�ģ�Ӧ���жϲ����ϵ����
 */
public class P125_ValidPalindrome {
	public boolean isPalindrome(String s) {
		if(s == null ||"".equals(s.trim())) {
			return true;
		}
		
		int low = 0;
		int high = s.length() - 1;
		
		while (low <= high) {
			while(low<=high && !Character.isLetterOrDigit(s.charAt(low)))
				low++;
			while(low<=high && !Character.isLetterOrDigit(s.charAt(high)))
				high--;
			if(low <= high && Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
				return false;
			} else {
				low++;
				high--;
			}
		}
		return true;
	}
}
/*
 * ������ 1���մ�������հ��ַ��Ĵ�
 */
