package easy;

public class P006_ZigZagConversion {

	public static String convert(String s, int numRows){
		
		if(numRows == 1)
			return s;
		int length = s.length();
		char[] newStr = new char[length];		
		int maxRow = numRows - 1;
		int currRow = 0;
		int index = 0;//新的str的下标
		int oldIndex;//s的下标
		for(currRow = 0; currRow <= maxRow; currRow++) {
			oldIndex = currRow;
			while(oldIndex < length) {
				newStr[index++] = s.charAt(oldIndex);
				if(currRow == 0 || currRow == maxRow) {
					oldIndex += maxRow*2;					
				} else {
					oldIndex += (maxRow - currRow)*2;
					if(oldIndex < length) {
						newStr[index++] = s.charAt(oldIndex);
						oldIndex += currRow * 2;
					} else {
						break;
					}
				}
			}
		}
		return new String(newStr);
	}
	
	public static void main(String args[]) {
		System.out.println(convert("A", 1));
	}
}
