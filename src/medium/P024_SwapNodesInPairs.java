package medium;

public class P024_SwapNodesInPairs {

	public static ListNode swapPairs(ListNode head) {
		if (head == null) {
			return null;
		}
		
		ListNode fakeHead = new ListNode(Integer.MAX_VALUE);
		fakeHead.next = head;
		
		ListNode pre = fakeHead;
		ListNode first = head;
		ListNode second = first.next;
		while (second != null) {
			first.next = second.next;
			second.next = first;
			pre.next = second;
			
			pre = first;
			first = pre.next;
			if (first == null)
				break;
			second = first.next;
		}
		
		return fakeHead.next;
	}
	
	public static void p(ListNode p)
	{
		while(p!=null) {
			System.out.println(p.val);
			p = p.next;
		}
	}
	public static void main(String args[]) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		
		ListNode q = swapPairs(head);
		p(q);
	}
}
