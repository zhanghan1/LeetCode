package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P119_PascalsTriangleII {

	public List<Integer> getRow(int rowIndex) {
		if(rowIndex < 0)
			return new ArrayList<Integer>();
		
		List<Integer> res = new ArrayList<>(rowIndex+1);
		for (int i = 0; i < rowIndex+1; i++) {
			res.add(i, 0);
		}
		res.set(0, 1);
		for (int i = 1; i <= rowIndex; i++) {
			res.set(i, 1);
			for (int j = 1; j < i; j++) {
				res.set(j, res.get(j-1) + res.get(j)) ;
			}
		}
		return res;
	}
}
