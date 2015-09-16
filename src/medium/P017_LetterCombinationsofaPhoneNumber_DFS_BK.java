package medium;

import java.util.ArrayList;
import java.util.List;

public class P017_LetterCombinationsofaPhoneNumber_DFS_BK {

	private List<String> ret = new ArrayList<>();
	
	public List<String> letterCombinations(String digits) {
		if (digits.length() == 0)
			return ret;
		
		String[] map = new String[10];
		map[0] = "";
		map[1] = "";
		map[2] = "abc";
		map[3] = "def";
		map[4] = "ghi";
		map[5] = "jkl";
		map[6] = "mno";
		map[7] = "pqrs";
		map[8] = "tuv";
		map[9] = "wxyz";
		
		char[] temp = new char[digits.length()];
		dfsGetStr(digits, map, 0, temp);
		return ret;
	}
	
	private void dfsGetStr(String digits, String[] map, int step, char[] temp) {
		if (step == digits.length()) {
			ret.add(new String(temp));
			return;
		}
		
		for (int i = 0; i < map[digits.charAt(step)-'0'].length(); i++) {
			temp[step] = map[digits.charAt(step)-'0'].charAt(i);
			dfsGetStr(digits, map, step+1, temp);
		}
	}
}
