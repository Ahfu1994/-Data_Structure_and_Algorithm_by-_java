package Stack;

public class Test_StackLinkedList {

	public static void main(String[] args) {
		StackLinkedList st = new StackLinkedList();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st.sizeOfStack());
		
		System.out.println(st.isEmpty());
		
//		System.out.println(st.peek());
		st.traversalStack();
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		st.deleteStack();
		
//		System.out.println(st.sizeOfStack());
		

	}

}
