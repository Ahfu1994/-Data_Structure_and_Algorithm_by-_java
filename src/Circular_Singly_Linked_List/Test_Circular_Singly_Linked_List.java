package Circular_Singly_Linked_List;

import java.util.Iterator;

public class Test_Circular_Singly_Linked_List {

	public static void main(String[] args) {
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.createCSLL(10);
//		System.out.println(csll.head.value);
		for (int i = 0; i < 10; i++) {
			int number = (int)(Math.random()*100);
			System.out.println(number + " insert in circular singly linked list in index "+0);
			csll.insertCSLL(number, 0);
		}
		
		csll.drawCSSL();
//		csll.serachNode(10);
		
		csll.removeCSSL(0);
		csll.drawCSSL();
		
		
		csll.deleteCSSL();
		csll.drawCSSL();
		

	}

}
