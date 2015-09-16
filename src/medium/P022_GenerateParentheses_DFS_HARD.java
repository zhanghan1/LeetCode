package medium;

/*
 * ²Î¿¼×ÊÁÏ
 *http://blog.csdn.net/yutianzuijin/article/details/13161721 
 */
import java.util.ArrayList;
import java.util.List;

public class P022_GenerateParentheses_DFS_HARD {

	private List<String> ret = new ArrayList<>();
	
	public List<String> generateParenthesis(int n) {
		generate("",n,n);
		return ret;
	}
	
	private void generate(String str, int left,int right) {
		if (left == 0 && right == 0) {
			ret.add(str);
			return;
		}
		if (left > 0) {
			generate(str+"(", left-1, right);
		}
		if (right > 0 && left < right) {
			generate(str+")", left, right - 1);
		}
	}
	
	public static void main(String args[]) {
//		List<String> list = generateParenthesis(3);
//		System.out.println(list);
	}
}
