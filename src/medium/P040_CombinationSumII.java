package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P040_CombinationSumII {

	private List<List<Integer>> ret = new ArrayList<>();
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<Integer> solution = new ArrayList<>();
		dfsBacktrack(candidates, target, 0, 0, solution);
		return ret;
	}
	
	private void dfsBacktrack(int[] candidates, int target, int step, int currSum, List<Integer> solution) {
		if (currSum > target) {
			return;
		}
		if (currSum == target) {
			if (!ret.contains(new ArrayList<Integer>(solution))) {
				ret.add(new ArrayList<Integer>(solution));
			}
			return;
		}
		
		for (int i = step; i < candidates.length; i++) {
			solution.add(candidates[i]);
			dfsBacktrack(candidates, target, i+1, currSum+candidates[i], solution);
			solution.remove(solution.size()-1);
		}
	}
}
