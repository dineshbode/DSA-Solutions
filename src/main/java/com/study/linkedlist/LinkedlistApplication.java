package com.study.linkedlist;

public class LinkedlistApplication {

    private static final LLTools LL_TOOLS = new LLTools();

	public static void main(String[] args) {
		Node node2 = new Node(20, null);
		Node node3 = new Node(20, null);
		Node head = new Node(10, null);
		head.next = node2;
		node2.next = node3;
		//[10 ->20-> 30 -> NULL]

		int size = LL_TOOLS.getSize(head);
		System.out.println("Size of linked list :: "+ size);

		int kthElement = LL_TOOLS.getElementAtKthNode(5, head);
		System.out.println("Kth Element :: "+kthElement);

		head = LL_TOOLS.insertElement(head, 0);
		LL_TOOLS.printLinkedList(head);
	}
}
