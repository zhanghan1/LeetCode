package easy;

public class P083_RemoveDuplicatesfromSortedList {
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null)
			return head;
		
		ListNode p = head;
		while (p.next != null) {
			if(p.val == p.next.val) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		return head;
	}
}
