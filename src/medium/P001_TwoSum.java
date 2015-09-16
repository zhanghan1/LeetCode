package medium;

import java.util.HashMap;
import java.util.Map;

public class P001_TwoSum {

	//方法2：使用hashMap,键为nums[i],值为i
	//time:o(n)  space:o(n)
	//使用hashMap要注意键是不能重复的!
	public int[] twoSum(int[] nums, int target) {
		
		int result[] = new int[2];
		Map<Integer,Integer> map = new HashMap<>();
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < length - 1 ; i++) {
			Integer rest = map.get(target-nums[i]);
			if (rest != null) {
				if (rest == i)
					continue;
				result[0] = i + 1;
				result[1] = rest + 1;
				break;
			}
		}
		return result;
	}
//	//解法1：Brute force
//	//time:O(n2)  space:O(1)
//	public int[] twoSum(int[] nums, int target) {
//		
//		int length = nums.length;
//		boolean found = false;
//		int result[] = new int[2];
//		for (int i = 0; i < length - 1; i++) {
//			int rest = target - nums[i];
//			for (int j = i + 1; j < length; j++) {
//				if (nums[j] == rest) {
//					result[0] = i+1;
//					result[1] = j+1;
//					found = true;
//					break;
//				}
//			}
//			if (found)
//				break;
//		}
//		return result;
//	}
}
