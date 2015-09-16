package easy;

public class P027_RemoveElement {

	public int removeElement(int[] nums, int val) {
		
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int length = nums.length;
		int newLength = 0;
		
		for(int i = 0; i < length; i++) {
			if(nums[i] != val) {
				nums[newLength++] = nums[i];
			}
		}
		return newLength;
	}
}
