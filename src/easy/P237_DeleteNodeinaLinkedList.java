package easy;
/*
 * ��ֻ�ܹ����ʵ�ǰ�ڵ������£�
 * ���ɾ����ǰ�ڵ㣨��ǰ�ڵ㲻�����һ������
 * ˼·��
 * ����һ���ڵ�����ݸ��Ƶ���ǰ�ڵ㣬ɾ����һ���ڵ�
 */
public class P237_DeleteNodeinaLinkedList {

	public void deleteNode(ListNode node) {
		
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
