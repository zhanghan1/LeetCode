package easy;
/*
 * �Եݹ鲻Ҫ�£��ú÷����� 
 */
public class P206_ReverseLinkedList {
	
//	//�ⷨ1���ǵݹ�(ʹ��fakeHead)
//	public ListNode reverseList(ListNode head) {
//		ListNode fakeHead = new ListNode(-1);
//		fakeHead.next = null;
//		
//		ListNode curr = head;
//		while (head != null) {
//			head = head.next;
//			curr.next = fakeHead.next;
//			fakeHead.next = curr;
//			curr = head;
//		}
//		return fakeHead.next;
//	}
	
	//�ⷨ3���ǵݹ飨��ʹ��fakeHead��
	public ListNode reverseList(ListNode head) {
		ListNode newHead = null;
		ListNode curr = head;
		
		while (curr != null) {
			head = head.next;
			curr.next = newHead;
			newHead = curr;
			curr = head;
		}
		return newHead;
	}
//	//�ⷨ2���ݹ�
//	public ListNode reverseList(ListNode head) {
//		return reverse(head, null);
//	}
//	
//	public ListNode reverse(ListNode head, ListNode newHead) {
//		if (head == null)
//			return newHead;
//		ListNode curr = head;
//		head = head.next;
//		curr.next = newHead;
//		newHead = curr;
//		return reverse(head,newHead);		
//	}
	
}
