package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * �����˼·��Ksum��˼·��һ��˼·��
 * �̶�һ�����ٹ̶�һ�������������˫ָ����������м����
 * ���ѵ���ȥ�ء� 
 *  ȥ�صĹؼ���Ҫ���Ѿ��������Ԫ�صĻ����ϣ��������ѷ��ʵ�Ԫ����ͬ��Ԫ��
 */
public class P018_4Sum {

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ret = new ArrayList<>();
		if (nums == null || nums.length < 4)
			return ret;
		
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = 0; i < len - 3; i++) {
			//trick1:ȥ��
			//��ǰԪ�غ��ѷ��ʹ���Ԫ�ص���ͬ�ģ�����
			if (i > 0 && nums[i] == nums[i-1])
				continue;
			for (int j = i + 1; j < len -2; j++) {
				//trick2:ȥ��
				//��ǰԪ�غ��ѷ��ʹ���Ԫ������ͬ�ģ�����
				if(j > i+1 && nums[j] == nums[j-1])
					continue;
				int l = j + 1;
				int r = len - 1;
				while (l < r) {
					int sum = nums[i] + nums[j] + nums[l] + nums[r];
					if (sum == target) {
						List<Integer> ans = new ArrayList<>();
						ans.add(nums[i]);
						ans.add(nums[j]);
						ans.add(nums[l]);
						ans.add(nums[r]);
						ret.add(ans);
						//trick3:ȥ��
						//��Ҫ������Ԫ�غ��ѷ��ʹ�����ͬ������
						while (l<r && nums[l] == nums[l+1]) l++;
						while (l<r && nums[r] == nums[r-1]) r--;
						l++;
						r--;
					} else if (sum < target) {
						l++;
					} else {
						r--;
					}
				}
			}
		}
		return ret;
	}
	
	public static void main(String args[]) {
//		int nums[] = new int[]{1,0,-1,0,-2,2};
		int nums[] = new int[]{0,0,0,0};
		int target = 0;
		List<List<Integer>> list = fourSum(nums, target);
		System.out.println(list);
	}
}
