package easy;

public class P026_RemoveDuplicatesfromSortedArray {

	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		
		int length = nums.length;
		int currValue = nums[0];
		int newLength = 1;
		
		for( int i = 1; i < length; i++) {
			if(nums[i] == currValue) {
				continue;
			} else {
				currValue = nums[i];
				nums[newLength++] = currValue;
			}
		}
		
		return newLength;
	}
}
