package easy;

import java.util.Stack;
/*
 * 序列和为某一个已知值sum，不一定非要将序列的和加起来与sum做比较
 * 可以每次将sum减去序列中的值，看最后的结果是否为0； 
 * 
 * 
 */
public class P112_PathSum {

	//解法1：非递归程序
	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		
		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> sums = new Stack<>();
		stack.push(root);
		sums.push(sum);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			int value = sums.pop();

			if (node.left == null && node.right == null && node.val == value) {
				return true;
			}
			if (node.right != null) {
				stack.push(node.right);
				sums.push(value - node.val);
			}
			if (node.left != null) {
				stack.push(node.left);
				sums.push(value - node.val);
			}
		}
		return false;
	}
	
//	//解法2：递归程序
//	public static boolean hasPathSum(TreeNode root, int sum) {
//		if (root == null)
//			return false;
//		
//		if (root.left == null && root.right == null && sum - root.val == 0) return true;
//		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//	}

	public static void main(String args[]) {
//		TreeNode root = new TreeNode(5);
//		TreeNode l11 = new TreeNode(4);
//		TreeNode l12 = new TreeNode(8);
//		TreeNode l21 = new TreeNode(11);
//		TreeNode l22 = new TreeNode(13);
//		TreeNode l23 = new TreeNode(4);
//		TreeNode l31 = new TreeNode(7);
//		TreeNode l32 = new TreeNode(2);
//		TreeNode l33 = new TreeNode(1);
//		
//		root.left = l11;
//		root.right = l12;
//		l11.left = l21;
//		l12.left = l22;
//		l12.right = l23;
//		l21.left = l31;
//		l21.right = l32;
//		l23.right = l33;
		TreeNode root = new TreeNode(1);
		TreeNode l11 = new TreeNode(-2);
		TreeNode l12 = new TreeNode(-3);
		TreeNode l21 = new TreeNode(1);
		TreeNode l22 = new TreeNode(3);
		TreeNode l23 = new TreeNode(-2);
		TreeNode l31 = new TreeNode(-1);
		
		root.left = l11;
		root.right = l12;
		l11.left = l21;
		l11.right = l22;
		l12.left = l23;
		l21.left = l31;
		System.out.println(hasPathSum(root,3));
	}
}
