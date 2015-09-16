package easy;

import java.util.Stack;

/*
 * �ж�һ�����ǲ��ǶԳƵ�
 * ����˼·�� 
 * �����ұ����͸���������ǲ�����ͬ�ġ�
 */
public class P101_SymmetricTree {
//  //�ⷨ1.�ݹ�ⷨ
//	public boolean isSymmetric(TreeNode root) {
//		if(root == null)
//			return true;
//		return isSymmetricSubTree(root.left, root.right);
//	}
//	
//	public boolean isSymmetricSubTree(TreeNode left, TreeNode right) {
//		if(left == null || right == null) return left == right;
//		if(left.val != right.val) {
//			return false;
//		}
//		return isSymmetricSubTree(left.left, right.right) && isSymmetricSubTree(left.right, right.left);
//	}
	//�ⷨ2��ʹ�÷ǵݹ����
	public boolean isSymmetric(TreeNode root) {		
		if(root == null)
			return true;
		
		Stack<TreeNode[]> stack = new Stack<>();		
		stack.push(new TreeNode[]{root,root});
		
		while(!stack.isEmpty()) {
			TreeNode[] pair = stack.pop();
			TreeNode t0 = pair[0];
			TreeNode t1 = pair[1];
			if (t0 == null && t1 == null) {
				continue;
			}
			if (t0 == null && t1 != null || t0 != null && t1 == null || t0.val != t1.val) {
				return false;
			}
			stack.push(new TreeNode[]{t0.left, t1.right});
			stack.push(new TreeNode[]{t0.right, t1.left});
		}
		return true;
	}
}
