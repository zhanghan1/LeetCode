package easy;

import java.util.ArrayList;
import java.util.List;
/*�ж�һ�����Ƿ���HappyNumber
 *����Ĺؼ����ж��Ƿ��л�
 *(1)����1��ʹ�ü��ϱ��������ж������ɵ��Ƿ��Ѿ�����
 *(2)����2�������˫ָ���ж��Ƿ��л�
 *����ķ�����
 *����HappyNumber������[2,6]����hanppynumber
 */
public class P202_HappyNumber {

//	//�ⷨ1��ʹ��һ�����ϱ����Ѿ����ֵ����֣��ж��ٴ����ɵ������Ƿ��ڼ���֮��
//	public static boolean isHappy(int n) {
//		int num = n;
//		int sumOfSqua = 0;
//		List<Integer> list = new ArrayList<Integer>();
//		while (true) {
//			while (num != 0) {
//				sumOfSqua +=Math.pow(num % 10, 2);
//				num/=10;
//			}
//			if(sumOfSqua != 1) {
//				if (list.contains(sumOfSqua)) {
//					return false;
//				} else {
//					list.add(sumOfSqua);
//				}
//				num = sumOfSqua;
//				sumOfSqua = 0;
//			} else {
//				return true;
//			}
//		}
//	}

	//�ⷨ2��ʹ�þ����˫ָ���л���
	public boolean isHappy(int n) {
		int slow = getNext(n);
		int fast = getNext(getNext(n));
		
		while (slow != fast) {
			slow = getNext(slow);
			fast = getNext(getNext(fast));
		}
		
		return slow == 1;
	}
	public int getNext(int n) {
		int sumOfSqua = 0;
		while (n != 0) {
			sumOfSqua +=Math.pow(n % 10, 2);
			n /= 10;
		}
		return sumOfSqua;
	}
}
/*
 *1)��happyNumber
 *2)����happyNumber,�ṹ��ѭ��
 */
