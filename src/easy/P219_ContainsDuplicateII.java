package easy;

import java.util.HashMap;
import java.util.Map;

public class P219_ContainsDuplicateII {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int length = nums.length;

		for (int i = 0; i < length; i++) {
			if (map.containsKey(nums[i])) {
				if (i - map.get(nums[i]) <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}
}
