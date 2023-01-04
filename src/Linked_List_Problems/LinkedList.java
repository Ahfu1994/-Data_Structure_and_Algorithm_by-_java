package Linked_List_Problems;

public class LinkedList {
	public Node head;
	public Node tail;
	public int size = 0;
	
	public Node createLL(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		head = node;
		tail = node;
		size++;
		return head;
	}
	
	//insert method
	public void insertNode(int nodeValue) {
		if (head == null) {
			createLL(nodeValue);
			return;
		}
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		tail.next = node;
		tail = node;
		size++;
	}
	
	//traversal method
	public void traversalLL() {
		Node node = head;
		for (int i = 0; i < size; i++) {
			System.out.print(node.value);
			if (i != size-1) {
				System.out.print("->");
			}
			node = node.next;
		}
		System.out.println();
	}
}
