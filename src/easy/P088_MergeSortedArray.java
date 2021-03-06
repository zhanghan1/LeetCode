package easy;
/*
 * 技巧：
 * 对于需要在数组中频繁移动的操作，
 * 应考虑首先从数组的尾部开始操作，以减少移动次数。
 */
public class P088_MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int index = m + n - 1;
		int p1 = m - 1;
		int p2 = n - 1;

		while (p1 >= 0 && p2 >= 0) {
			if(nums1[p1] > nums2[p2]) {
				nums1[index--] = nums1[p1--];
			} else {
				nums1[index--] = nums2[p2--];
			}
		}
		
		while (p2 >= 0) {
			nums1[index--] = nums2[p2--];
		}
	}
}
