package easy;
/* ������򵥣�����Ҫ����ȫ�档
 * ˼���ǣ��м�������5�����м���0
 * ����Ҫע�⣺25���֣�������
 */
public class P172_FactorialTrailingZeroes {

	public int trailingZeroes(int n) {

		int count = 0;
		while (n != 0) {
			count += n/5;
		}
		return count;
	}
}
