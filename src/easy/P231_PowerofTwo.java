package easy;
/*
 * ע��
 * λ�������Ҫ����:
 * n & n-1 ��n���ұߵ�1��Ϊ0��
 * PowerOfTwo��ֻ��һλ��1 
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
