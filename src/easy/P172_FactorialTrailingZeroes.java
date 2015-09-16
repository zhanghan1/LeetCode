package easy;
/* 此题虽简单，但是要考虑全面。
 * 思想是：有几个因子5，就有几个0
 * 尤其要注意：25这种！！！！
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
