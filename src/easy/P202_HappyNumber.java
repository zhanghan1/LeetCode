package easy;

import java.util.ArrayList;
import java.util.List;
/*判断一个数是否是HappyNumber
 *此题的关键是判断是否有环
 *(1)方法1：使用集合保存结果，判断新生成的是否已经存在
 *(2)方法2：经典的双指针判断是否有环
 *另外的方法：
 *利用HappyNumber的性质[2,6]不是hanppynumber
 */
public class P202_HappyNumber {

//	//解法1、使用一个集合保存已经出现的数字，判断再次生成的数字是否在集合之中
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

	//解法2：使用经典的双指针判环法
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
 *1)是happyNumber
 *2)不是happyNumber,会构成循环
 */
