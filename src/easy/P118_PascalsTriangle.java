package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P118_PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		if(numRows <= 0)
			return res;
		List<Integer> tempList = null;
		for (int i = 1; i <= numRows; i++) {
			Integer[] array = new Integer[i];
			array[0] = 1;
			array[i-1] = 1;
			for (int j = 1; j < i - 1; j++) {
				array[j] = tempList.get(j-1) + tempList.get(j);
			}
			tempList = Arrays.asList(array);
			res.add(tempList);
		}
		return res;
	}
}
