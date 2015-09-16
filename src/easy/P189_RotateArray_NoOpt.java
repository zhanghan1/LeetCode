package easy;
/*
 * 考虑问题要全面：
 * 1）只有一个元素，无论怎么旋转都不变，直接返回
 * 2）k为0，不旋转，直接返回
 * 3）k的值大于数组的长度的时候（要格外注意） 
 */
public class P189_RotateArray_NoOpt {

	public static void rotate(int[] nums, int k) {
		k = k % nums.length;//k的值大于nums的长度的情况
		if (k == 0 || nums.length == 1)
            return;
		rotateArray(nums, 0, nums.length - 1);
		rotateArray(nums, 0, k-1);
		rotateArray(nums, k, nums.length - 1);
	}
	
	public static void rotateArray(int[] nums, int start, int end) {
		int mid = (end - start)/2;
		for (int i = 0; i <= mid; i++) {
			int temp = nums[start+i];
			nums[start+i] = nums[end-i];
			nums[end-i] = temp;
		}
	}
	
	public static void main(String args[]) {
		int[] nums = new int[]{1,2};
		rotate(nums,3);
		for(int i = 0; i< 2; i++) {
			System.out.print(nums[i]+"  ");
		}
	}
}
