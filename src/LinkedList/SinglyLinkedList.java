package LinkedList;

public class SinglyLinkedList {
	public Node head;
	public Node tail;
	public int size = 0;
	
	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		
		node.next = null;
		node.value = nodeValue;
		
		head = node;
		tail = node;
		size = 1;
		
		return head;
	}
	
	//insert method 
	public void insertSinglyLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		
		if (head == null) { 
			createSinglyLinkedList(nodeValue);
			return ;
		}
		else if (location == 0) { // insert first
			node.next = head;
			head = node;
		}
		else if (location >= size) { // insert last
			node.next = null;
			tail.next = node;
			tail = node;
		}
		else { // insert somewhere
			Node tempNode = head;
			int index = 0;
			while (index < location-1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}
		size++;
	}
	
	//search method
	public boolean searchSinglyLinkedList(int searchValue) {
		Node node = head;
		int i = 0;
		while (node != null) {
			if (node.value == searchValue) {
				System.out.println("The "+searchValue+" in node "+i);
				return true; 
			}
			node = node.next;
			i++;
		}
		System.out.println("Not has a "+searchValue+" in singly linked list.");
		return false;
	}
	
	//remove the first node
	public void removeFirstSinglyLinkedList() {
		head = head.next;
		size--;
	}
	
	//remove the last node
	public void removeLastSinglyLinkedList() {
		Node node = head;
		int i = 0;
		while (i < size-1) {
			node = node.next;
			i++;
		}
		node = null;
		size--;
	}
	
	
	//remove any given node
	public void removeSinglyLinkedList(int deleteLocation) {
		if (deleteLocation > size-1) {
			System.out.println("Not has this node.");
			return ;
		}
		else if(deleteLocation == 0) {
			removeFirstSinglyLinkedList();
			return ;
		}
		else if (deleteLocation == size) {
			removeLastSinglyLinkedList();
			return ;
		}
		Node node = head;
		int i = 0;
		while (i < deleteLocation-1) {
			node = node.next;
			i++;
		}
		node.next = node.next.next;
		size--;
		
	}
	
	//delete singly linked list
	public void deleteSinglyLinkedList() {
		head = null;
		tail = null;
		System.out.println("The Singly linked list deleted successfully");
		size = 0;
	}
	
	public void drawSinglyLinkedList() {
		if (head == null) {
			System.out.println("Singly linked list does not exist!.");
			return ;
		}
		Node node = head;
		for (int i = 0; i < size; i++) {
			System.out.print(node.value);
			if (i != size-1) {
				System.out.print(" -> ");
			}
			node = node.next;
			
			}
		System.out.println();
	}
		
}
