package easy;
/* (1)爬楼梯原型题目
 * 当只有1阶台阶，即n为1时，迈1步到达最高的台阶，所以f(1)=1
 * 当只有2阶台阶，即n为2时，迈两次1步或者迈2步到达最高的台阶，所以f(2)=2
 * 当有n阶台阶时，最后一步可选择迈1步或2步，所以f(n)=f(n-1)+f(n-2)
 * 得到递归模型：
 * f(1)=1
 * f(2)=2
 * f(n)=f(n-1)+f(n-2)
 * 可见即为著名的斐波拉契数列。
 * (2)变形题目
 * 假设一个楼梯有 N 阶台阶，人每次最多可以跨 M 阶，求总共的爬楼梯方案数。
 * 例如楼梯总共有3个台阶，人每次最多跨2个台阶，也就是说人每次可以走1个，也可以走2个，
 * 但最多不会超过2个，那么楼梯总共有这么几种走法：111，12，21
 * 详见P070_ClimbingStairs_Hard.java
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
	// 递归实现
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
