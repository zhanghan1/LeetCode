package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P015_3Sum {
	
	private List<List<Integer>> ret = new ArrayList<>();
	
	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3)
			return ret;
		
		Arrays.sort(nums);
		int length = nums.length;

		for (int i = 0; i < length-2; i++) {
			if (i > 0 && nums[i] == nums[i-1])
				continue;
			find(nums, i + 1, length-1, nums[i]);
		}
		return ret;
    }
	
	private void find(int[] nums, int begin, int end, int target) {
		int l = begin;
		int r = end;
		
		while (l < r) {
			if (target + nums[l] + nums[r] == 0) {
				List<Integer> ans = new ArrayList<>();
				ans.add(target);
				ans.add(nums[l]);
				ans.add(nums[r]);
				ret.add(ans);
				while (l<r && nums[l] == nums[l+1]) l++;
				while (l<r && nums[r] == nums[r-1]) r--;
				l++;
				r--;
			} else if (target + nums[l] + nums[r] < 0) {
				l++;
			} else {
				r--;
			}
		}
	}
}
