package easy;
/*
 * 注：
 * 位运算的重要性质:
 * n & n-1 将n最右边的1变为0。
 * PowerOfTwo将只有一位是1 
 * 
 */
public class P231_PowerofTwo {

	public boolean isPowerOfTwo(int n) 
	{
		if (n <= 0)
			return false;
		return (n & n-1) == 0;
	}
}
