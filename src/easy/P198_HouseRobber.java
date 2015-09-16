package easy;
/*
 * ��ֵ���⣺DP
 * ״̬ת�Ʒ��̣�
 * dp[i]��ʾ��iʱ�������������γɵ�����
 * dp[i] = max(dp[i-1], dp[i-2]+nums[i])
 * dp[0] = nums[0]
 * dp[1] = max(nums[0], nums[1])
 */
public class P198_HouseRobber {
	public int rob(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		
		int length = nums.length;
		int dp[] = new int[nums.length];
		
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
		}
		return dp[length-1];
	}
}
