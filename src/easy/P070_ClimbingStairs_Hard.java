package easy;
/* 爬楼梯变形题目
 * (2)变形题目
 * 假设一个楼梯有 N 阶台阶，人每次最多可以跨 M 阶，求总共的爬楼梯方案数。
 * 例如楼梯总共有3个台阶，人每次最多跨2个台阶，也就是说人每次可以走1个，也可以走2个，
 * 但最多不会超过2个，那么楼梯总共有这么几种走法：111，12，21
 */
public class P070_ClimbingStairs_Hard {

	public static int climbStairs(int n, int limit) {
		int sumStep = 0;
        //总台阶数为0时，终止递归循环
        if (n == 0) {
            return 1;
        }
        if (n >= limit) {
            //如果n大于每步最大台阶数，则设置第一步为m之内的一个台阶数，然后递归循环
            for (int i = 1; i <= limit; i++) {
                sumStep += climbStairs(n - i, limit);
            }
        }
        //如果n小于m，则将一步最大台阶数缩小为n，重新递归
        else {
            sumStep = climbStairs(n, n);
        }
        return sumStep;
	}
}
