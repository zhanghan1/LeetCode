package easy;
/*
 * 素数筛法：
 * (1)标记isPrime[]全为素数
 * (2)选当前最小的素数i做筛子，从i*i开始，将所有i的倍数筛掉（标记为非素数）
 * (3)选下一个最小的素数做筛子，重复(2)，直到筛遍所有的数
 */

public class P204_CountPrimes {

	
	//使用素数筛法(空间换时间)
	public static int countPrimes(int n) {
		boolean[] isPrime = new boolean[n];
		for(int i = 2; i < n; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i*i < n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j < n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime[i]) count++;
		}
		return count;
	}
//	//普通解法：Time Limit Exceeded
//	public static int countPrimes(int n) {
//		int count = 0;
//		for (int i = 2; i < n; i++) {
//			if (isPrime(i)) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public static boolean isPrime(int n) {
//		int round = (int) (Math.sqrt(n) + 1);
//		for(int i = 2; i< round; i++) {
//			if (n % i == 0)
//				return false;
//		}
//		return true;
//	}
	
	public static void main(String args[]) {
		int n = 499979;
		System.out.println(countPrimes(n));
	}
}
