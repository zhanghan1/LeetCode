package medium;

/**
 * �ο����ϣ�
 * http://www.cnblogs.com/xinsheng/p/3510989.html
 * @author ZHan *
 */
public class P034_SearchforaRange {

	public static int[] searchRange(int[] nums, int target) {
		int[] ret = new int[2];
		int left = lSearch(nums, target);
		int right = rSearch(nums, target);
		ret[0] = left;
		ret[1] = right;
		return ret;
	}
	
	private static int lSearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		
		while (low <= high) {
			int mid = low + (high-low)/2;
			if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		//low������λ�������ұ߱�targetС����һ��λ��
		if (low == nums.length || nums[low] != target) {
			return -1;
		}
		return low;
	}
	
	private static int rSearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		
		while (low <= high) {
			int mid = low + (high-low)/2;
			if (nums[mid] <= target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		//high������λ��������߱�target���ǰһ��λ��
		if (high == -1 || nums[high] != target) {
			return -1;
		}
		return high;
	}
	
	public static void main(String args[]) {
		int[] nums = new int[]{1};
		int target = 2;
		
		int[] result = searchRange(nums, target);
		System.out.println(result[0] + "," + result[1]);
	}
}
