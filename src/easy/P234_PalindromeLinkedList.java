package easy;

import java.util.Stack;
/*【题目】判断单链表是否是回文的
 *
 *【思路】
 *（1）将链表的前一半反转，并于后一半进行比较
 *（2）时间复杂度O(n),空间复杂度O(1)
 *（3）使用双指针法
 *（4）为了不改变链表，在比较过程中，再次将前一半反转回初始状态
 */
public class P234_PalindromeLinkedList {

	public static boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode rev = null;//前一半翻转后的头指针
		ListNode toBeReversed = slow;//当前将要添加到翻转链表中的节点
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			toBeReversed.next = rev;
			rev = toBeReversed;
			toBeReversed = slow;
		}

		ListNode tail = slow;//再次将前一半翻转后的头指针
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
	// * 想法：
	// *（1）计算单链表的长度
	// *（2）将链表的前一半反转
	// *（3）使用双指针分别遍历，前一半链表和后一半链表
	// *（4）时间复杂度o(n),空间复杂度o(1)
	// *（5）改变了链表的结构
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
	// *想法：
	// *（1）计算单链表的长度
	// *（2）用栈保存一半链表的数据
	// *（3）时间复杂度o(n),空间复杂度o(n)
	// *（4）不改变链表的结构
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
