package easy;

import java.util.LinkedList;
import java.util.Queue;

public class P226_InvertBinaryTree {
	
	//�ⷨ2���ǵݹ����
	public TreeNode invertTree(TreeNode root) {
		if (root == null) 
			return null;
		
		//ʹ�ò�α���
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			TreeNode temp = node.left;
			node.left = node.right;
			node.right = temp;
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		return root;
	}
//	//�ⷨ1���ݹ����
//	public TreeNode invertTree(TreeNode root) {
//		if (root == null)
//			return null;
//		
//		TreeNode temp = root.left;
//		root.left = root.right;
//		root.right = temp;
//		invertTree(root.left);
//		invertTree(root.right);
//		return root;
//	}
}
