package easy;
/*
 * ��������Ҫȫ�棺
 * 1��ֻ��һ��Ԫ�أ�������ô��ת�����䣬ֱ�ӷ���
 * 2��kΪ0������ת��ֱ�ӷ���
 * 3��k��ֵ��������ĳ��ȵ�ʱ��Ҫ����ע�⣩ 
 */
public class P189_RotateArray_NoOpt {

	public static void rotate(int[] nums, int k) {
		k = k % nums.length;//k��ֵ����nums�ĳ��ȵ����
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
