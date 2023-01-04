package Circular_Doubly_Linked_List;

public class Test_CircularDoublyLinkedList {

	public static void main(String[] args) {
		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
		cdll.createCDLL(200);
		System.out.println(cdll.head.value);
		
		for (int i = 0; i < 10; i++) {
			int number = (int)(Math.random()*100);
			System.out.println(number + " insert in circular doubly linked list in index "+i);
			cdll.insertCDLL(number, i);
		}
		
		cdll.traversalCDLL();
		cdll.reverseTraversalCDLL();
		
		cdll.removeNodeCDLL(0);
		
		cdll.traversalCDLL();
		cdll.reverseTraversalCDLL();
		
//		cdll.searchCDLL(200);
		
//		cdll.traversalCDLL();
		
		cdll.deleteCDLL();
		System.out.println(cdll.size);
		cdll.traversalCDLL();
	}

	
}
