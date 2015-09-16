package easy;

public class P168_ExcelSheetColumnTitle {

	public static String convertToTitle(int n) {
		String str = "";
		int temp;
		while (n!=0) {
			temp = n%26;
			if(temp == 0) {
				temp = 26;
				n-=26;
			}
			str = (char)(temp-1+'A')+str;
			n = n/26;
		}
		return str;
	}
	
	public static void main(String args[]) {
		int n = 22;
		System.out.println(convertToTitle(n));
	}
}
