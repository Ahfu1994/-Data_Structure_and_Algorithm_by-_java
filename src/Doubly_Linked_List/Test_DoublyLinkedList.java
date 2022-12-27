package Doubly_Linked_List;

public class Test_DoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.createDLL(100);
		System.out.println(dll.head.value);

		for (int i = 0; i < 10; i++) {
			int number = (int)(Math.random()*100);
			System.out.println(number + " insert in Doubly linked list in index "+0);
			dll.insertDLL(number ,i);
		}
		
		dll.traversalDLL();
//		dll.reverseTraversalDLL();
		dll.removeDLL(10);
		dll.traversalDLL();
//		dll.reverseTraversalDLL();
		
//		System.out.println(dll.searchDLL(100));
		dll.deleteDLL();
		dll.traversalDLL();
		
		
		
	}

}
