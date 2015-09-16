package easy;

import java.util.HashMap;
import java.util.Map;

public class P205_IsomorphicStrings {
	
	public static boolean isIsomorphic(String s, String t) {
		Map<Character,Character> mapS = new HashMap<>();
		Map<Character,Character> mapT = new HashMap<>();
		
		int length = s.length();
		for (int i = 0; i < length; i++) {
			if (mapS.containsKey(s.charAt(i))) {
				if (mapS.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			} else if (mapT.containsKey(t.charAt(i))) {
				if (mapT.get(t.charAt(i)) != s.charAt(i)) {
					return false;
				}
				
			} else {
				mapS.put(s.charAt(i), t.charAt(i));
				mapT.put(t.charAt(i), s.charAt(i));
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		String s = "ab";
		String t = "aa";
		System.out.println(isIsomorphic(s, t));
	}
}
