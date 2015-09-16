package easy;

import java.util.Arrays;

public class P242_ValidAnagram {
	
	public static boolean isAnagram(String s, String t) {
    
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		
		return Arrays.equals(s1, t1);
    }
	
	public static void main(String args[]) {
		String s = "anagram";
		String t = "nagara";
		System.out.println(isAnagram(s, t));
	}
}
