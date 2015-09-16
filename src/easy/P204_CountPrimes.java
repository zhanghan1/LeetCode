package easy;
/*
 * ����ɸ����
 * (1)���isPrime[]ȫΪ����
 * (2)ѡ��ǰ��С������i��ɸ�ӣ���i*i��ʼ��������i�ı���ɸ�������Ϊ��������
 * (3)ѡ��һ����С��������ɸ�ӣ��ظ�(2)��ֱ��ɸ�����е���
 */

public class P204_CountPrimes {

	
	//ʹ������ɸ��(�ռ任ʱ��)
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
//	//��ͨ�ⷨ��Time Limit Exceeded
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
