package easy;
/* ��¥�ݱ�����Ŀ
 * (2)������Ŀ
 * ����һ��¥���� N ��̨�ף���ÿ�������Կ� M �ף����ܹ�����¥�ݷ�������
 * ����¥���ܹ���3��̨�ף���ÿ������2��̨�ף�Ҳ����˵��ÿ�ο�����1����Ҳ������2����
 * ����಻�ᳬ��2������ô¥���ܹ�����ô�����߷���111��12��21
 */
public class P070_ClimbingStairs_Hard {

	public static int climbStairs(int n, int limit) {
		int sumStep = 0;
        //��̨����Ϊ0ʱ����ֹ�ݹ�ѭ��
        if (n == 0) {
            return 1;
        }
        if (n >= limit) {
            //���n����ÿ�����̨�����������õ�һ��Ϊm֮�ڵ�һ��̨������Ȼ��ݹ�ѭ��
            for (int i = 1; i <= limit; i++) {
                sumStep += climbStairs(n - i, limit);
            }
        }
        //���nС��m����һ�����̨������СΪn�����µݹ�
        else {
            sumStep = climbStairs(n, n);
        }
        return sumStep;
	}
}
