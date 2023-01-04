package Circular_Doubly_Linked_List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class CircularDoublyLinkedList {
	public DoublyNode head;
	public DoublyNode tail;
	public int size;
	
	public DoublyNode createCDLL(int nodeValue) {
		head = new DoublyNode();
		DoublyNode node = new DoublyNode();
		node.value = nodeValue;
		head = node;
		tail = node;
		node.next = node;
		node.prev = node;
		size = 1;
		return head;
	}
	
	//insert method
	public void insertCDLL(int nodeValue, int location) {
		DoublyNode node = new DoublyNode();
		node.value = nodeValue;
		if (head == null) {
			createCDLL(nodeValue);
			return;
		}
		else if (location == 0) {
			node.next = head;
			node.prev = tail;
			head.prev = node;
			tail.next = node;
			head = node;
		}
		else if (location >= size){
			node.next = head;
			node.prev = tail;
			head.prev = node;
			tail.next = node;
			tail = node;
		}
		else {
			DoublyNode temp = head;
			int index = 0;
			while (index < location-1) {
				temp = temp.next;
				index++;
			}
			node.prev = temp;
			node.next = temp.next;
			temp.next = node;
			node.next.prev = node;
		}
		size++;
	}
	
	//traversal method
	public void traversalCDLL() {
		if (head != null) {
			DoublyNode temp = head;
			int index = 0;
			while (index < size) {
				System.out.print(temp.value);
				if (index < size -1) {
					System.out.print("->");
				}
				temp = temp.next;
				index++;
			}
		}
		else {
			System.out.println("The CDLL does not exist.");
		}
		System.out.println();
	}
	
	//reverse traversal method
	public void reverseTraversalCDLL() {
		if (head != null) {
			DoublyNode temp = tail;
			int index = 0;
			while (index < size) {
				System.out.print(temp.value);
				if (index < size-1) {
					System.out.print("<-");
				}
				temp = temp.prev;
				index++;
			}
		}
		else {
			System.out.println("The CDLL does not exist!");
		}
		System.out.println();
	}
	
	//search method
	public boolean searchCDLL(int searchValue) {
		if (head == null) {
			System.out.println("CDLL dose not exist!!!");
			return false;
		}
		else {
			DoublyNode temp = head;
			int index = 0;
			while (index < size) {
				if (temp.value == searchValue) {
					System.out.println(searchValue +" found in node "+index);
					return true;
				}
				temp = temp.next;
				index++;
			}
			System.out.println();
		}
		return false;
	}
	
	//remove method
	public void removeNodeCDLL(int location) {
		if (head == null) {
			System.out.println("The CDLL does not exist!!!");
			return ;
		}
		else if(location == 0) {
			if (size == 1) {
				head.prev = null;
				head.next = null;
				head = null;
				tail = null;
				size--;
				return;
			}
			else {
				head = head.next;
				head.prev = tail;
				tail.next = head;
				size--;
			}
		}
		else if (location >=size) {
			if (size == 1) {
				head.prev = null;
				head.next = null;
				head = null;
				tail = null;
				size--;
				return;
			}
			else {
				tail = tail.prev;
				tail.next = head;
				head.prev = tail;
				size--;
			}
		}
		else {
			DoublyNode temp = head;
			int index = 0;
			while (index < location-1) {
				temp = temp.next;
				index++;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
			size--;
		}
	}
	
	//delete CDLL method
	public void deleteCDLL() {
		DoublyNode node = head;
		for (int i = 0; i <size; i++) {
			node.prev = null;
			node = node.next;
		}
		head = null;
		tail = null;
		size = 0;
		System.out.println("The CDLL has been deleted!");
	}
}
