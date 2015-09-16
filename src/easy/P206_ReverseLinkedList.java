package easy;
/*
 * 对递归不要怕，好好分析！ 
 */
public class P206_ReverseLinkedList {
	
//	//解法1：非递归(使用fakeHead)
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
	
	//解法3：非递归（不使用fakeHead）
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
//	//解法2：递归
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
