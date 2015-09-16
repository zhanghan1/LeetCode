package easy;
/*
 * 在只能够访问当前节点的情况下，
 * 如何删掉当前节点（当前节点不是最后一个）？
 * 思路：
 * 将下一个节点的数据复制到当前节点，删除下一个节点
 */
public class P237_DeleteNodeinaLinkedList {

	public void deleteNode(ListNode node) {
		
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
