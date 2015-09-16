package easy;
/*
 * 此题很简单。
 * 但是要写得好，还是很要功力的! 
 */
public class P203_RemoveLinkedListElements {

//	//解法1:使用fakeHead(牛B！)(可以避免掉head==null，不用进行判断)
//	public ListNode removeElements(ListNode head, int val) {
//		ListNode fakeHead = new ListNode(-1);
//		fakeHead.next = head;
//		
//		ListNode pre = fakeHead;
//		ListNode curr = head;
//		while (curr != null) {
//			if (curr.val == val) {
//				pre.next = curr.next;
//			} else {
//				pre = pre.next;
//			}
//			curr = curr.next;
//		}
//		
//		return fakeHead.next;
//	}
	
	//解法2：先不对head中的值进行判断，最后再对head进行删除
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		
		ListNode p = head;
		while (p.next != null) {
			if (p.next.val == val) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		
		return head.val == val ? head.next : head;
	}
}
/*
 * 1）val为第一个元素的值 2）链表仅有一个元素，且为val的值
 */
