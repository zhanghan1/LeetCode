package easy;

public class P019_RemoveNthNodeFromEndofList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null || n <= 0)
			return head;
		
		ListNode prev = head;
		ListNode curr = head;
		int step = 0;
		for (step = 0; step < n; step++) {
			if(curr!=null) {
				curr = curr.next;
			} else {
				break;
			}			
		}
		
		if(step < n) {
			return head;
		}
		if(step == n && curr == null) {
			head = head.next;
			return head;
		}
		
		while(curr.next!=null) {
			prev = prev.next;
			curr = curr.next;
		}
		
		prev.next = prev.next.next;
		return head;
	}
}
