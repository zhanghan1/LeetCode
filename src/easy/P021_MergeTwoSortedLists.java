package easy;

public class P021_MergeTwoSortedLists {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode head = null;
		ListNode p = null;
		ListNode node;
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				node = new ListNode(l1.val);				
				l1 = l1.next;
			} else {
				node = new ListNode(l2.val);
				l2 = l2.next;
			}
			if(p == null) {
				p = node;
				head = p;
			} else {
				p.next = node;
				p = p.next;
			}
		}
		while(l1 != null) {
			node = new ListNode(l1.val);
			l1 = l1.next;
			if(p == null) {
				p = node;
				head = p;
			} else {
				p.next = node;
				p = p.next;
			}
		}
		while(l2 != null) {
			node = new ListNode(l2.val);
			l2 = l2.next;
			if(p == null) {
				p = node;
				head = p;
			} else {
				p.next = node;
				p = p.next;
			}
		}
		return head;
	}
	
	public static void main(String args[]) {
		ListNode l1 = null;
		ListNode l2 = new ListNode(0);
		System.out.println(mergeTwoLists(l1, l2));
	}
}
