package easy;

import java.util.ArrayList;
import java.util.List;

public class P257_BinaryTreePaths {

	private List<String> result = new ArrayList<String>();
		
	public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return result;
    }
	
	public void dfs(TreeNode node, String path) {
		if (node == null)
			return;
		path = path + node.val;
		if (node.left == null && node.right == null) {
			result.add(path);
		}
		path = path + "->";
		dfs(node.left, path);
		dfs(node.right, path);
	}
}
