package LinkedList;

public class Test_Singly_Linked_List {

	public static void main(String[] args) {
		SinglyLinkedList ss = new SinglyLinkedList();
//		ss.createSinglyLinkedList(1);
//		for (int i = 0; i < 10; i++) {
//			int value = (int)(Math.random()*100);
//			System.out.println(value +" insert at node "+i);
//			ss.insertSinglyLinkedList(value, i);
//		}
		ss.insertSinglyLinkedList(10, 0);
		ss.insertSinglyLinkedList(20, 0);
		ss.insertSinglyLinkedList(20, 0);
		ss.insertSinglyLinkedList(30, 0);
		ss.insertSinglyLinkedList(40, 0);
		ss.insertSinglyLinkedList(50, 0);
		ss.insertSinglyLinkedList(100, 0);
		ss.insertSinglyLinkedList(200, 1);
		ss.drawSinglyLinkedList();
		
//		ss.searchSinglyLinkedList(120);
//		ss.removeSinglyLinkedList(7);
		ss.removeFirstSinglyLinkedList();
//		ss.removeLastSinglyLinkedList();
		
		ss.drawSinglyLinkedList();
		
		ss.deleteSinglyLinkedList();
		
	}

}
