package easy;
/*
 * 小技巧：
 * n=n&(n-1)将n最右边的1变为0
 */
public class P191_Numberof1Bits {

	public static int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n & (n - 1);
		}
		return count;
	}
	
	public static void main(String args[]) {
		int n = 11;
		System.out.println(hammingWeight(n));
	}
}
