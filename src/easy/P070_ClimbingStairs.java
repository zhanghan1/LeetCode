package easy;
/* (1)��¥��ԭ����Ŀ
 * ��ֻ��1��̨�ף���nΪ1ʱ����1��������ߵ�̨�ף�����f(1)=1
 * ��ֻ��2��̨�ף���nΪ2ʱ��������1��������2��������ߵ�̨�ף�����f(2)=2
 * ����n��̨��ʱ�����һ����ѡ����1����2��������f(n)=f(n-1)+f(n-2)
 * �õ��ݹ�ģ�ͣ�
 * f(1)=1
 * f(2)=2
 * f(n)=f(n-1)+f(n-2)
 * �ɼ���Ϊ������쳲��������С�
 * (2)������Ŀ
 * ����һ��¥���� N ��̨�ף���ÿ�������Կ� M �ף����ܹ�����¥�ݷ�������
 * ����¥���ܹ���3��̨�ף���ÿ������2��̨�ף�Ҳ����˵��ÿ�ο�����1����Ҳ������2����
 * ����಻�ᳬ��2������ô¥���ܹ�����ô�����߷���111��12��21
 * ���P070_ClimbingStairs_Hard.java
 */
public class P070_ClimbingStairs {

	public static int climbStairs(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		int a = 1;
		int b = 2;
		int temp;
		for (int i = 3; i <= n; i++) {
			temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}
	// �ݹ�ʵ��
	// public int climbStairs(int n) {
	// if(n == 1)
	// return 1;
	// if(n == 2)
	// return 2;
	// return climbStairs(n-1) + climbStairs(n-2);
	// }

	public static void main(String args[]) {
		int n = 3;
		System.out.println(climbStairs(n));
	}
}
