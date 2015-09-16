package easy;

public class P110_BalancedBinaryTree {

	//�ⷨ1�����µ��ϣ�Bottom Top��
	public boolean isBalanced(TreeNode root) {
		return treeDepth(root) != -1;
	}
	
	//������ƽ��ģ��������ĸ߶ȣ���������ƽ��ģ�����-1
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
//	//�ⷨ2�����ϵ��£�Top Bottom��
//	//�Ӹ���ʼ���õ�������������ȣ�Ȼ���ж��Ƿ���ƽ��ģ�����������
//	//ȱ�㣺�����ǴӸ���ʼ�жϵģ��ڵ���ظ��������
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
