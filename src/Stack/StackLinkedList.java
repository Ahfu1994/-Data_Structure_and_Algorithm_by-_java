package Stack;

public class StackLinkedList {
	
	LinkedList ll = new LinkedList();
	
	public void push(int nodeValue) {
		ll.insertNode(nodeValue);
	}
	
	public int pop() {
		int topOfStack = ll.head.value;
		ll.removeFirst();
		return topOfStack;
	}
	
	public boolean isEmpty() {
		return ll.size == 0 ;
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		}
		return ll.head.value; 
	}
	
	public int sizeOfStack() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		}
		return ll.size;
	}
	
	public void traversalStack() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return;
		}
		ll.traversalLinkedList();
	}
	
	public void deleteStack() {
		ll.deletLinkedList();
		System.out.println("The stack deleted successfully");
	}
	
}

class LinkedList{
	Node head;
	int size;
	
	public LinkedList() {
		head = new Node();
		size = 0;
	}
	
	public void insertNode(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		node.next = head;
		head = node;
		size++;
	}
	
	public void removeFirst() {
		Node node = head;
		head = head.next;
		size--;
	}
	
	public void traversalLinkedList() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	public void deletLinkedList() {
		head = null;
		size = 0;
	}
	
}

class Node{
	int value;
	Node next;
}
