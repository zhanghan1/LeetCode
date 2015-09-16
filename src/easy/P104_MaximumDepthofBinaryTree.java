package easy;

import java.util.LinkedList;
import java.util.Queue;

public class P104_MaximumDepthofBinaryTree {

//	//解法1：递归程序
//	public int maxDepth(TreeNode root) {
//		if (root == null) {
//			return 0;
//		}
//		
//		int leftDepth = maxDepth(root.left);
//		int rightDepth = maxDepth(root.right);
//		return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
//	}
	
	//解法2：广度优先遍历
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		
		int depth = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			int size = queue.size();
			depth++;
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (node.left != null)
					queue.offer(node.left);
				if (node.right != null)
					queue.offer(node.right);
			}
		}
		return depth;
	}
}
