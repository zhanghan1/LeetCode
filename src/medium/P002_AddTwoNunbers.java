package medium;

public class P002_AddTwoNunbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode fakeHead = new ListNode(-1);
		ListNode p = fakeHead;
		
		int carry = 0;
		while (p1 != null && p2 != null) {
			int sum = p1.val + p2.val + carry;
			int value = sum%10;
			carry = sum/10;
			ListNode node = new ListNode(value);
			p.next = node;
			p = node;
			p1 = p1.next;
			p2 = p2.next;
		}
		
		while (p1 != null) {
			int sum = p1.val + carry;
			int value = sum%10;
			carry = sum/10;
			ListNode node = new ListNode(value);
			p.next = node;
			p = node;
			p1 = p1.next;
		}
		
		while (p2 != null) {
			int sum = p2.val + carry;
			int value = sum%10;
			carry = sum/10;
			ListNode node = new ListNode(value);
			p.next = node;
			p = node;
			p2 = p2.next;
		}
		
		if (carry==1) {
			ListNode node = new ListNode(carry);
			p.next = node;
			p = node;
		}
		return fakeHead.next;
	}
	
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//		ListNode p1 = l1;
//		ListNode p2 = l2;
//		ListNode fakeHead = new ListNode(-1);
//		ListNode p = fakeHead;
//		
//		int carry = 0;
//		while (p1 != null && p2 != null) {
//			int sum = p1.val + p2.val + carry;
//			int value = sum%10;
//			carry = sum/10;
//			ListNode node = new ListNode(value);
//			p.next = node;
//			p = node;
//			p1 = p1.next;
//			p2 = p2.next;
//		}
//		
//		while (p1 != null) {
//			int sum = p1.val + carry;
//			int value = sum%10;
//			carry = sum/10;
//			ListNode node = new ListNode(value);
//			p.next = node;
//			p = node;
//			p1 = p1.next;
//		}
//		
//		while (p2 != null) {
//			int sum = p2.val + carry;
//			int value = sum%10;
//			carry = sum/10;
//			ListNode node = new ListNode(value);
//			p.next = node;
//			p = node;
//			p2 = p2.next;
//		}
//		
//		if (carry==1) {
//			ListNode node = new ListNode(carry);
//			p.next = node;
//			p = node;
//		}
//		return fakeHead.next;
//	}
}
