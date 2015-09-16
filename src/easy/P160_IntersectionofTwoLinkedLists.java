package easy;

public class P160_IntersectionofTwoLinkedLists {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		
		int lengthA = getListLength(headA);
		int lengthB = getListLength(headB);
		int diff = lengthA - lengthB;
		if (diff >= 0) {
			for (int i = 0; i < diff; i++) {
				headA = headA.next;
			}
		} else {
			diff = -diff;
			for (int i = 0; i < diff; i++) {
				headB = headB.next;
			}
		}
		
		while (headA != null && headB != null) {
			if(headA == headB)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}
	
	public int getListLength(ListNode head) {
		ListNode p = head;
		int length = 0;
		while (p != null) {
			length++;
			p = p.next;
		}
		return length;
	}
}
