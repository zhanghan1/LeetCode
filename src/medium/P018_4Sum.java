package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * 这题的思路的Ksum的思路是一个思路，
 * 固定一个，再固定一个。。。。最后双指针从两边向中间遍历
 * 【难点是去重】 
 *  去重的关键是要在已经访问完的元素的基础上，跳过和已访问的元素相同的元素
 */
public class P018_4Sum {

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ret = new ArrayList<>();
		if (nums == null || nums.length < 4)
			return ret;
		
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = 0; i < len - 3; i++) {
			//trick1:去重
			//当前元素和已访问过的元素的相同的，跳过
			if (i > 0 && nums[i] == nums[i-1])
				continue;
			for (int j = i + 1; j < len -2; j++) {
				//trick2:去重
				//当前元素和已访问过的元素是相同的，跳过
				if(j > i+1 && nums[j] == nums[j-1])
					continue;
				int l = j + 1;
				int r = len - 1;
				while (l < r) {
					int sum = nums[i] + nums[j] + nums[l] + nums[r];
					if (sum == target) {
						List<Integer> ans = new ArrayList<>();
						ans.add(nums[i]);
						ans.add(nums[j]);
						ans.add(nums[l]);
						ans.add(nums[r]);
						ret.add(ans);
						//trick3:去重
						//将要遍历的元素和已访问过的相同，跳过
						while (l<r && nums[l] == nums[l+1]) l++;
						while (l<r && nums[r] == nums[r-1]) r--;
						l++;
						r--;
					} else if (sum < target) {
						l++;
					} else {
						r--;
					}
				}
			}
		}
		return ret;
	}
	
	public static void main(String args[]) {
//		int nums[] = new int[]{1,0,-1,0,-2,2};
		int nums[] = new int[]{0,0,0,0};
		int target = 0;
		List<List<Integer>> list = fourSum(nums, target);
		System.out.println(list);
	}
}
