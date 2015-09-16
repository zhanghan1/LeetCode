package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class P107_BinaryTreeLevelOrderTraversalII {

	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
		 List<List<Integer>> res = new ArrayList<>();
		 if (root == null)
			 return res;
		 
		 Queue<TreeNode> queue = new LinkedList<>();
		 Stack<List<Integer>> stack = new Stack<>();
		 queue.offer(root);
		 
		 while (!queue.isEmpty()) {
			 int size = queue.size();
			 List<Integer> list = new ArrayList<Integer>();
			 for (int i = 0; i < size; i++) {
				 TreeNode node = queue.poll();
				 list.add(node.val);
				 if (node.left != null) {
					 queue.offer(node.left);
				 }
				 if (node.right != null) {
					 queue.offer(node.right);
				 }
			 }
			 stack.push(list);
		 }
		 while (!stack.isEmpty()) {
			 res.add(stack.pop());
		 }
		 return res;
	 }
}
