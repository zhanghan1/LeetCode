package easy;
/*
 * 经典
 * 寻找主元素
 */
public class P169_MajorityElement {
	
	//解法2：投票法
	//基本思想：在一个集合中，删除两个不同的数，则集合的主元素保持不变。
	public int majorityElement(int[] nums) {
		
		int length = nums.length;
		int result = nums[0];
		int count = 1;
		for (int i = 1; i < length; i++) {
			if(count == 0) {
				result = nums[i];
				count = 1;
			} else {
				if(result == nums[i]) {
					count++;
				} else {
					count--;
				}
			}
		}
		
		return result;
	}
//	//解法1：利用快速排序,主元素一定是位于中间的元素
//	public int majorityElement(int[] nums) {
//		
//		int low = 0;
//		int high = nums.length - 1;
//		int mid = low + (high - low) / 2;
//		int index = partition(nums, low, high);
//		while (index != mid) {
//			if (index > mid) {
//				high = index - 1;
//			} else {
//				low = index + 1;
//			}
//			index = partition(nums, low, high);
//		}
//		return nums[index];
//	}
//	
//	public int partition(int[] nums, int low, int high) {
//		int pivot = nums[low];
//		
//		while (low < high) {
//			while (low < high && nums[high] > pivot) {
//				high--;
//			}
//			swap(nums, low, high);
//			while (low < high && nums[low] <= pivot) {
//				low++;
//			}
//			swap(nums, low, high);
//		}
//		return low;
//	}
//	
//	public void swap(int[] nums, int i, int j) {
//		int temp = nums[i];
//		nums[i] = nums[j];
//		nums[j] = temp;
//	}
}
