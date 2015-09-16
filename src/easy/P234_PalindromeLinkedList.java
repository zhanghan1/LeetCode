package easy;

import java.util.Stack;
/*����Ŀ���жϵ������Ƿ��ǻ��ĵ�
 *
 *��˼·��
 *��1���������ǰһ�뷴ת�����ں�һ����бȽ�
 *��2��ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(1)
 *��3��ʹ��˫ָ�뷨
 *��4��Ϊ�˲��ı������ڱȽϹ����У��ٴν�ǰһ�뷴ת�س�ʼ״̬
 */
public class P234_PalindromeLinkedList {

	public static boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode rev = null;//ǰһ�뷭ת���ͷָ��
		ListNode toBeReversed = slow;//��ǰ��Ҫ��ӵ���ת�����еĽڵ�
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			toBeReversed.next = rev;
			rev = toBeReversed;
			toBeReversed = slow;
		}

		ListNode tail = slow;//�ٴν�ǰһ�뷭ת���ͷָ��
		toBeReversed = rev;
		if (fast != null)
			slow = slow.next;
		boolean isPalin = true;
		while (rev != null) {
			if (rev.val != slow.val) {
				isPalin = false;
			}
			slow = slow.next;
			rev = rev.next;
			toBeReversed.next = tail;
			tail = toBeReversed;
			toBeReversed = rev;
		}

		return isPalin;
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	// /*
	// * �뷨��
	// *��1�����㵥����ĳ���
	// *��2���������ǰһ�뷴ת
	// *��3��ʹ��˫ָ��ֱ������ǰһ������ͺ�һ������
	// *��4��ʱ�临�Ӷ�o(n),�ռ临�Ӷ�o(1)
	// *��5���ı�������Ľṹ
	// */
	// public static boolean isPalindrome(ListNode head) {
	// if (head == null)
	// return true;
	//
	// int length = 0;
	// ListNode p = head;
	// while (p != null) {
	// length++;
	// p = p.next;
	// }
	//
	// ListNode newHead = null;
	// p = head;
	// for (int i = 0; i < length/2; i++) {
	// head = head.next;
	// p.next = newHead;
	// newHead = p;
	// p = head;
	// }
	// if (length%2 == 1)
	// head = head.next;
	//
	// for (int i = 0; i < length/2; i++) {
	// if (newHead.val != head.val) {
	// return false;
	// }
	// newHead = newHead.next;
	// head = head.next;
	// }
	// return true;
	// }

	// /*
	// *�뷨��
	// *��1�����㵥����ĳ���
	// *��2����ջ����һ�����������
	// *��3��ʱ�临�Ӷ�o(n),�ռ临�Ӷ�o(n)
	// *��4�����ı�����Ľṹ
	// */
	// public static boolean isPalindrome(ListNode head) {
	// if (head == null)
	// return true;
	//
	// ListNode p = head;
	// int length = 0;
	// while(p!=null) {
	// length++;
	// p = p.next;
	// }
	// p = head;
	// Stack<Integer> stack = new Stack<>();
	// for (int i = 0; i < length/2; i++) {
	// stack.push(p.val);
	// p = p.next;
	// }
	// if (length%2 == 1){
	// p = p.next;
	// }
	// while (p != null) {
	// int num = stack.pop();
	// if(p.val != num) {
	// return false;
	// }
	// p = p.next;
	// }
	// return true;
	// }

	public static void main(String args[]) {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(2);
		ListNode node6 = new ListNode(1);

		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = null;
		
		printList(head);
		System.out.println(isPalindrome(head));
		printList(head);
	}
}
