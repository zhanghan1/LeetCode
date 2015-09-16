package easy;

/*
 * 启发：
 * 判断符合条件还是判断不符合条件
 * 对于不符合条件即false的，应该判断不符合的情况
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
 * 特例： 1）空串或仅含空白字符的串
 */
