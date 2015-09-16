package easy;

import java.util.HashSet;
import java.util.Set;

public class P217_ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int length = nums.length;
		for(int i = 0; i < length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}
		
		return false;
	}
}
