package medium;

import java.util.Arrays;
/**
 * 【解题思路】
 * 全排列问题：字典序
 * (1)从后往前找，找到了相邻递增的两个元素nums[i]、nums[j]（i<j）
 * (2)从后往前找，找到第一个大于nums[i]的元素nums[k]，交换nums[i]和nums[k]
 * (3)将从j开始到最后的子数组的元素反转
 * @author 
 */
public class P031_NextPermutation {

	public static void nextPermutation(int[] nums) {
		int length = nums.length;
		if (length == 1)
			return;
		boolean found = false;
		for (int i = length-2; i>=0; i--) {
			if (nums[i] < nums[i+1]) {
				//从后往前找，找到了相邻递增的两个元素nums[i]、nums[j]（i<j）
				found = true;
				int j = i + 1;
				//从后往前找，找到第一个大于nums[i]的元素nums[k]，交换nums[i]和nums[k]
				for (int k = length-1; k>=j;k--) {
					if (nums[i] < nums[k]) {
						int temp = nums[i];
						nums[i] = nums[k];
						nums[k] = temp;
						break;
					}
				}
				//将从j开始到最后的子数组的元素反转
				reverse(nums, j, length-1);
				break;
			}
		}
		if (!found) {
			Arrays.sort(nums);
		}
	}
	
	//反转数组
	private static void reverse(int[] nums, int start, int end) {
		int mid = (end - start)/2;
		for (int i = 0; i <= mid; i++) {
			int temp = nums[start+i];
			nums[start+i] = nums[end-i];
			nums[end-i] = temp;
		}
	}
	
	private static void p(int[] nums) {
		int length = nums.length;
		for (int i =0 ; i < length; i++){
			System.out.print(nums[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int[] nums = new int[]{1,2,3,4};
		nextPermutation(nums);
		p(nums);
		nextPermutation(nums);
		p(nums);
		nextPermutation(nums);
		p(nums);
		nextPermutation(nums);
		p(nums);
		nextPermutation(nums);
		p(nums);
	}
}
