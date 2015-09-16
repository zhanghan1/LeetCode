package easy;

/*
 * ע����Ŀ�е�Ҫ��
 * ����������
 * ˼·��
 * ��1�������ǰ���ڵ��ֵ��������ֵ�����������м�������
 * ��2�������ǰ���ڵ��ֵС������ֵ�����������м�������
 * ��3�������ǰ���ڵ��ֵ������ֵ֮����ߵ�������һ��ֵ����ǰ����Ϊ��
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
