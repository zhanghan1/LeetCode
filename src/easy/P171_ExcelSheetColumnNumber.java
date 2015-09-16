package easy;

public class P171_ExcelSheetColumnNumber {

	public int titleToNumber(String s) {
		
		int num = 0;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			int curr = (int)(s.charAt(i) - 'A' + 1);
			num = num * 26 + curr;
		}
		return num;
	}
}
