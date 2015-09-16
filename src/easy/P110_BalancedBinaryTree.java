package easy;

public class P110_BalancedBinaryTree {

	//解法1：从下到上（Bottom Top）
	public boolean isBalanced(TreeNode root) {
		return treeDepth(root) != -1;
	}
	
	//当树是平衡的，返回树的高度；当树不是平衡的，返回-1
	public int treeDepth(TreeNode root) {
		if (root == null)
			return 0;
		
		int leftDepth = treeDepth(root.left);
		if (leftDepth == -1) return -1;
		int rightDepth = treeDepth(root.right);
		if (rightDepth == -1) return -1;
		
		if(Math.abs(leftDepth - rightDepth)>1) return -1;
		
		return Math.max(leftDepth, rightDepth) + 1;
	}
//	//解法2：从上到下（Top Bottom）
//	//从根开始，得到左右子树的深度，然后判断是否是平衡的，继续往下走
//	//缺点：由于是从根开始判断的，节点后重复遍历多次
//	public boolean isBalanced(TreeNode root) {
//		if (root == null)
//			return true;
//
//		int leftDepth = treeDepth(root.left);
//		int rightDepth = treeDepth(root.right);
//		
//		if(Math.abs(leftDepth - rightDepth) > 1)
//			return false;
//		return isBalanced(root.left) && isBalanced(root.right);
//	}
//	
//	public int treeDepth(TreeNode root) {
//		if(root == null)
//			return 0;
//		
//		int leftDepth = treeDepth(root.left);
//		int rightDepth = treeDepth(root.right);
//		
//		return Math.max(leftDepth, rightDepth) + 1;
//	}
}
