package easy;

import java.util.LinkedList;
import java.util.Queue;
/*
 *            5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
 */
public class P111_MinimumDepthofBinaryTree {
	
	//解法3：递归程序
	//最需要注意的是：左右子树的高度有一个为0的情况！！！
	public static int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		
		if (left == 0)
			return right + 1;
		if (right == 0)
			return left + 1;
		
		return Math.min(left,right) + 1;
	}
	
//	//解法2：广度优先遍历（BFS）
//	//层次遍历是很明显的解法!!!
//	public static int minDepth(TreeNode root) {
//		if (root == null)
//			return 0;
//		
//		Queue<TreeNode> queue = new LinkedList<>();
//		queue.offer(root);
//		int depth = 0;
//		while (!queue.isEmpty()) {
//			int size = queue.size();
//			depth++;
//			for (int i = 0; i < size; i++) {
//				TreeNode node = queue.poll();
//				if (node.left == null && node.right == null) {
//					return depth;
//				}
//				if (node.left != null) {
//					queue.offer(node.left);
//				}
//				if (node.right != null) {
//					queue.offer(node.right);
//				}
//			}
//		}
//		return depth;
//	}
	
//	//解法1：非递归程序(DFS)
//	//思路：遍历每个节点的过程中，保存当前节点的深度
//	public static int minDepth(TreeNode root) {
//		if (root == null)
//			return 0;
//		
//		Stack<TreeNode> stack = new Stack<>();
//		Stack<Integer> depthStack = new Stack<>();
//		stack.push(root);
//		depthStack.push(1);
//		int minTreeDepth = Integer.MAX_VALUE;
//		
//		while (!stack.isEmpty()) {
//			TreeNode node = stack.pop();
//			int currDepth = depthStack.pop();
//			if (node.left == null && node.right == null) {
//				if (currDepth < minTreeDepth) {
//					minTreeDepth = currDepth;
//				}
//			}
//			if (node.right != null) {
//				stack.push(node.right);
//				depthStack.push(currDepth + 1);
//			}
//			if (node.left != null) {
//				stack.push(node.left);
//				depthStack.push(currDepth + 1);
//			}
//		}
//		return minTreeDepth;
//	}	
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(5);
		TreeNode l11 = new TreeNode(4);
		TreeNode l12 = new TreeNode(8);
		TreeNode l21 = new TreeNode(11);
		TreeNode l22 = new TreeNode(13);
		TreeNode l23 = new TreeNode(4);
		TreeNode l31 = new TreeNode(7);
		TreeNode l32 = new TreeNode(2);
		TreeNode l33 = new TreeNode(1);
		
		root.left = l11;
		root.right = l12;
		l11.left = l21;
		l12.left = l22;
		l12.right = l23;
		l21.left = l31;
		l21.right = l32;
		l23.right = l33;
		
		System.out.println(minDepth(root));
	}
}
