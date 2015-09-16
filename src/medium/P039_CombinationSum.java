package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P039_CombinationSum {
	
	private static List<List<Integer>> ret = new ArrayList<>();
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);

		List<Integer> solution = new ArrayList<>();
		dfsBacktrack(candidates,target,0,0,solution);
		return ret;
	}
	
	public static void dfsBacktrack(int[] candidates, int target, int step, int currSum, List<Integer> solution) {
		if (currSum > target) {
			return;
		}
		if (currSum == target) {
			ret.add(new ArrayList(solution));//要注意，不能写ret.add(solution)
			return;
		}
		for (int i = step; i < candidates.length ; i++) {
			solution.add(candidates[i]);
			dfsBacktrack(candidates, target, i, currSum+candidates[i], solution);
			//回溯,这是关键
			solution.remove(solution.size()-1);
		}
	}
	
	public static void main(String args[]) {
		//int[] nums = new int[]{2,3,6,7};
		//int target = 7;
		int[] nums = new int[]{1};
		int target = 2;
		List<List<Integer>> list = combinationSum(nums,target);
		System.out.println(list);
	}
}
