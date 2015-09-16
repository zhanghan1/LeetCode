package medium;

import java.util.Arrays;
/**
 * ������˼·��
 * ȫ�������⣺�ֵ���
 * (1)�Ӻ���ǰ�ң��ҵ������ڵ���������Ԫ��nums[i]��nums[j]��i<j��
 * (2)�Ӻ���ǰ�ң��ҵ���һ������nums[i]��Ԫ��nums[k]������nums[i]��nums[k]
 * (3)����j��ʼ�������������Ԫ�ط�ת
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
				//�Ӻ���ǰ�ң��ҵ������ڵ���������Ԫ��nums[i]��nums[j]��i<j��
				found = true;
				int j = i + 1;
				//�Ӻ���ǰ�ң��ҵ���һ������nums[i]��Ԫ��nums[k]������nums[i]��nums[k]
				for (int k = length-1; k>=j;k--) {
					if (nums[i] < nums[k]) {
						int temp = nums[i];
						nums[i] = nums[k];
						nums[k] = temp;
						break;
					}
				}
				//����j��ʼ�������������Ԫ�ط�ת
				reverse(nums, j, length-1);
				break;
			}
		}
		if (!found) {
			Arrays.sort(nums);
		}
	}
	
	//��ת����
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
