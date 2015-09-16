package easy;
/*
 * ����ܼ򵥡�
 * ����Ҫд�úã����Ǻ�Ҫ������! 
 */
public class P203_RemoveLinkedListElements {

//	//�ⷨ1:ʹ��fakeHead(ţB��)(���Ա����head==null�����ý����ж�)
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
	
	//�ⷨ2���Ȳ���head�е�ֵ�����жϣ�����ٶ�head����ɾ��
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
 * 1��valΪ��һ��Ԫ�ص�ֵ 2���������һ��Ԫ�أ���Ϊval��ֵ
 */
