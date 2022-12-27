package Doubly_Linked_List;

public class DoublyLinkedList {

	public DoublyNode head;
	public DoublyNode tail;
	public int size;
	
	public DoublyNode createDLL(int nodeValue) {
		head = new DoublyNode();
		DoublyNode node = new DoublyNode();
		node.value = nodeValue;
		node.next = null;
		node.prev = null;
		head = node;
		tail = node;
		size = 1;
		
		return head;
	}
	
	public void insertDLL(int nodeValue ,int location) {
		DoublyNode node = new DoublyNode();
		node.value = nodeValue;
		if (head == null) {
			createDLL(nodeValue);
			return ;
		}
		else if (location == 0) {
			node.prev = null;
			node.next = head;
			head.prev = node;
			head = node;
			
		}
		else if (location >= size) {
			node.next = null;
			node.prev = tail;
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
	public void traversalDLL() {
		if (head != null) {
			DoublyNode node = head;
			int index = 0;
			while (index < size) {
				System.out.print(node.value);
				if (index < size-1) {
					System.out.print("->");
				}
				node = node.next;
				index++;
			}
			System.out.println();
			
		}
		else {
			System.out.println("The DLL does not exist!!!");
		}
		
	}
	
	//reverse traversal method
	public void reverseTraversalDLL() {
		if (head != null) {
			DoublyNode node = tail;
			int index = 0;
			while (index < size) {
				System.out.print(node.value);
				if (index < size-1) {
					System.out.print("->");
				}
				node = node.prev;
				index++;
			}
			System.out.println();
		}
	}
	
	public boolean searchDLL(int searchValue) {
		if (head == null) {
			System.out.println("DLL does not exits!!");
			return false;
		}
		else {
			DoublyNode temp = head;
			int index = 0;
			while (index < size) {
				if(temp.value == searchValue) {
					System.out.println("This value is found int node "+index);
					return true;
				}
				temp = temp.next;
				index++;
			}
		}
		return false;
	}
	
	//remove method
	public void removeDLL(int location) {
		if (head == null) {
			System.out.println("The DLL dose not exist!!!");
			return ;
		}
		else if (location == 0) {
			if (size == 1) {
				head =null;
				tail = null;
				size--;
				return ;
			}
			else {
				head = head.next;
				head.prev = null;
				size--;
				return;
			}
		
		}
		else if (location >= size) {
			DoublyNode temp = tail.prev;
			if (size == 1) {
				head =null;
				tail = null;
				size--;
				return;
			}
			else {
				temp.next = null;
				tail = temp;
				size--;
				return;
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
			temp.prev = temp;
			size--;
		}
	}
	
	//delete method
	public void deleteDLL() {
		DoublyNode temp = head;
		int index = 0;
		while (index < size) {
			temp.prev = null;
			temp = temp.next;
			index++;
		}
		head = null;
		tail = null;
		System.out.println("The DLL has been deleted successfully.");
	}
	
}
