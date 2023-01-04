package Linked_List_Problems;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.createLL(3);
		ll.insertNode(5);
		ll.insertNode(8);
		ll.insertNode(5);
		ll.insertNode(10);
		ll.insertNode(2);
		ll.insertNode(1);
		ll.traversalLL();
		
		
//		deleteDups(ll);
		
//		System.out.println(nthToLast(ll , 2).value);
//		ll.traversalLL();
		
		partition(ll, 5).traversalLL();
		
		LinkedList ll1 = new LinkedList();
		ll1.insertNode(3);
		ll1.insertNode(1);
		ll1.insertNode(5);
		ll1.insertNode(9);
		LinkedList ll2 = new LinkedList();
		ll2.insertNode(2);
		ll2.insertNode(4);
		ll2.insertNode(6);
//		System.out.println(addLinkedList(ll1,ll2).size);
//		addLinkedList(ll1,ll2).traversalLL();
		
		addSameNode(ll1, ll2, 7);
		addSameNode(ll1, ll2, 2);
		addSameNode(ll1, ll2, 2);
		
		Node inter = findIntersection(ll1, ll2);
		System.out.println(inter.value);
		
		

	}
	
	//method delete duplicate value in linked list
	public static void deleteDups(LinkedList ll) {
		HashSet<Integer> hs = new HashSet();
		Node current = ll.head;
		Node prev = null;
		while (current != null) {
			int currentValue = current.value;
			if (hs.contains(currentValue)) {
				prev.next = current.next;
				ll.size--;
			}
			else {
				hs.add(currentValue);
				prev = current;
			}
			current = current.next;
		}
		
	}
	
	//return Nth to last
	public static Node nthToLast(LinkedList ll , int n) {
		Node p1 = ll.head;
		Node p2 = ll.head;
		
		for (int i = 0; i < n; i++) {
			if (p2 == null) {
				return null;
			}
			p2 = p2.next;
		}
		while (p2 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
	
	//add node before list that less than value x
	public static LinkedList partition(LinkedList ll, int x) {
		Node currentNode = ll.head;
		ll.tail = ll.head;
		while (currentNode != null) {
			Node next = currentNode.next;
			if (currentNode.value < x) {
				currentNode.next = ll.head;
				ll.head = currentNode;
			}
			else {
				ll.tail.next = currentNode;
				ll.tail = currentNode;
			}
			currentNode = next;
		}
		ll.tail.next = null;
		return ll;
	}

	
	//all to linked list
	public static LinkedList addLinkedList(LinkedList ll1 , LinkedList ll2) {
		int num1 = 0;
		int num2 = 0;
		int result  = 0;
		Node temp1 = ll1.head;
		Node temp2 = ll2.head;
		
		int len1 = ll1.size;
		int index1 = 0;
		while (index1 < len1) {
			//sum all node in ll1
			num1 = num1+temp1.value;
			temp1 = temp1.next;	
			if (index1 == len1-1) {
				break;
			}
			num1 = num1*10;
			index1++;
		}
		
		int len2 = ll2.size;
		int index2 = 0;
		while (index2 < len2) {
			//sum all node in ll2
			num2 = num2+temp2.value;
			temp2 = temp2.next;		
			if (index2 == len2-1) {
				break;
			}
			num2 = num2*10;
			index2++;
		}
		
		result  = num1 + num2;
		LinkedList llresult = new LinkedList();
		//add result in linked list
		int len3 = len1 > len2? len1 : len2;
		int index3 = 0;
		int inputValue = 0;
		inputValue = result%10;
		llresult.createLL(inputValue);
		result = result/10;
		while (index3 < len3-1) {
			inputValue = result%10;
			llresult.insertNode(inputValue);
			result = result/10;
			index3++;
		}
//		llresult.size = len3;
		return llresult;
	}

	//get Kth node
	public static Node getKthNode(Node head, int k) {
		Node current = head;
		while (k >0 && current != null) {
			current = current.next;
			k--;
		}
		return current;
	}
	
	//Intersection method
	public static Node findIntersection(LinkedList ll1, LinkedList ll2) {
		if (ll1.head == null || ll2.head ==null) {
			return null;
		}
		
		Node shorter =  new Node();
		Node longer = new Node();
		if (ll1.size > ll2.size) {
			longer = ll1.head;
			shorter = ll2.head;
		}
		else {
			shorter = ll1.head;
			longer = ll2.head;
		}
		
		longer = getKthNode(longer, Math.abs(ll1.size-ll2.size));
		while (shorter != longer) {
			shorter = shorter.next;
			longer = longer.next;
		}
		return longer;
		
	}
	
	//add same node
	public static void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		
		llA.tail.next = node;
		llA.tail = node;
		
		llB.tail.next = node;
		llB.tail = node;
		
		
	}






}
