package medium;

import java.util.Arrays;

public class P016_3SumClosest {

	public static int threeSumClosest(int[] nums, int target) {
		
		Arrays.sort(nums);
		
		int diff = Integer.MAX_VALUE;
		int length = nums.length;
		int result = 0;
		for (int i = 0; i < length - 2; i++) {
			int l = i+1;
			int r = length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (Math.abs(sum - target) < diff) {
					diff = Math.abs(sum - target);
					result = sum;
				}
				if (sum == target) {
					return sum;
				}
				if (sum < target) {
					l++;
				} else {
					r--;
				}
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		int nums[] = new int[]{-1,2,1,-4};
		int target = 1;
		System.out.println(threeSumClosest(nums,target));
	}
}
