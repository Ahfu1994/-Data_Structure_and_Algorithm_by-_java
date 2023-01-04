package Queue;


public class LinkedListQueue {
	
	LinkedList ll ;
	
	public LinkedListQueue() {
		ll = new LinkedList();
	}
	
	public boolean isEmpty() {
		return ll.size == 0;
	}
	
	//enQueue
	public void enQueue(int value) {
		ll.insertNode(value);
	}
	
	//deQueue
	public int deQueue() {
		int result = ll.lastNode();
		ll.removeLast();
		return result;
	}
	
	//peek
	public int peek() {
		return ll.lastNode();
	}
	
	//delelteQueue
	public void deleteQueue() {
		ll.head = null;
		System.out.println("The Queue successfully deleted");
	}
	
//	public static void main(String[]args) {
//		LinkedList ll = new LinkedList();
//		ll.insertNode(1);
//		ll.insertNode(2);
//		ll.insertNode(3);
//		ll.insertNode(4);
//		ll.insertNode(5);
//		ll.traversalLinkedList();
//		
//		System.out.println(ll.lastNode());
//	}
	

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
	
	public void removeLast() {
		Node node = head;
		int index = 0;
		while (index < size - 1) {
			node = node.next;
			index++;
		}
		node.next = null;
		size--;
	}
	
	public int lastNode() {
		Node node = head;
		int index = 0;
		while (node.next != null && index < size-1) {
			node = node.next;
			index++;
		}
		return node.value;
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
