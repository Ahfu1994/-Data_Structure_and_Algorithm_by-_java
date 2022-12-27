package Circular_Singly_Linked_List;

public class CircularSinglyLinkedList {

	public Node head;
	public Node tail;
	public int size = 0;
	
	public Node createCSLL(int nodeValue){
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		return head;
		
	}
	//inset first method
	public void insertFirstCSLL(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		
		if (head == null) {
			createCSLL(nodeValue);
			return;
		}
		node.next = head;
		head = node;
		tail.next = node;
		size++;
	}
	
	//insert last method
	public void insertLastCSSL(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		
		if (head == null) {
			createCSLL(nodeValue);
			return;
		}
		tail.next = node;
		tail = node;
		tail.next = head;
	}
	
	//insert method
	public void insertCSLL(int nodeValue,int location) {
		Node node = new Node();
		node.value = nodeValue;
		
		if (head == null) {
			createCSLL(nodeValue);
			return;
		}
		else if (location == 0) {
			insertFirstCSLL(nodeValue);
			return;
		}
		else if (location >= size) {
			insertLastCSSL(nodeValue);
			return;
		}
		else {
			Node tempNode = head;
			int index = 0;
			while (index < location-1) {
				tempNode = tempNode.next;
				index++;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}
		size++;		
	}
	
	//search value method
	public boolean serachNode(int searchValue) {
		if (head != null) {
			Node node = head;
			int i = 0;
			while (i < size) {
				if (node.value == searchValue) {
					System.out.println(searchValue+" keep in node "+i);
					return true;
				}
				node = node.next;
				i++;
			}
		}
		else {
			System.out.println("Node not found!");
		}
		return false;
	}
	
	//remove method
	public void removeCSSL(int location) {
		if (head == null) {
			System.out.println("This CSSLL does not exist!!");
			return ;
		}
		else if (location == 0) {
			head = head.next;
			tail.next = head;
			size--;
			if (size == 0) {
				tail = null;
				head.next = null;
				head = null;
			}
		}
		else if (location >= size) {
			Node node = head;
			int index = 0;
			while (index < size-1) {
				node = node.next;
				index++;
			}
			if (node == head) {
				head.next = null;
				tail = head = null;
				size--;
				return ;
			}
			node.next = head;
			tail = node;
			size--;
		}
		else {
			Node node = head;
			int index = 0;
			while (index < location-1) {
				node = node.next;
				index++;
			}
			node.next = node.next.next;
			size--;
		}
	}
	
	public void deleteCSSL() {
		if (head == null) {
			System.out.println("This CSSLL does not exist!!");
		}
		else {
			head = null;
			tail = null;
			System.out.println("This CSSLL has been deleted successfully");
			size = 0;
		}
		
	}
	
	//draw circular singly linked list(traverse)
	public void drawCSSL() {
		if (head != null) {
			Node node = head;
			int i = 0;
			while (i < size) {
				System.out.print(node.value);
				if (i != size-1) {
					System.out.print("->");
				}
				node = node.next;
				i++;
			}
			System.out.println();
		}
		else {
			System.out.println("CSSLL does not exist!!");
		}
		
	}
	
	
}
