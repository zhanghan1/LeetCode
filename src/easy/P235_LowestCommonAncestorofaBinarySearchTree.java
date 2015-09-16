package easy;

/*
 * 注意题目中的要求！
 * 二叉搜索树
 * 思路：
 * （1）如果当前根节点的值大于两个值，在左子树中继续查找
 * （2）如果当前根节点的值小于两个值，在右子树中继续查找
 * （3）如果当前根节点的值在两个值之间或者等于其中一个值，当前根即为解
 */
public class P235_LowestCommonAncestorofaBinarySearchTree {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		int min = Math.min(p.val, q.val);
		int max = Math.max(p.val, q.val);
		return lowestCommon(root, min, max);
	}
	
	public TreeNode lowestCommon(TreeNode root, int min, int max) {
		if (root.val >= min && root.val <= max)
			return root;
		if (root.val > max) 
			return lowestCommon(root.left, min, max);
		return lowestCommon(root.right, min, max);
	}
}
