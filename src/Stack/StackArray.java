package Stack;

import java.util.Iterator;

public class StackArray {
	int[] arr;
	int topOfStack;
	
	public StackArray(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("The stack is created with size of : "+ size);
	}
	
	public boolean isEmpty() {
		if (topOfStack == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if (topOfStack == arr.length-1) {
			System.out.println("The stack is full!!");
			return true;
		}
		return false;
	}
	
	public void push(int value) {
		if (isFull()) {
			System.out.println("The stack is full");
		}
		else {
			arr[topOfStack+1] = value;
			topOfStack++;
			System.out.println("The value is successfully inserted");
		}
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		}
		else {
			int topStack = arr[topOfStack];
			topOfStack--;
			return topOfStack;
		}	
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		}
//		System.out.println("Top of stack is "+arr[topOfStack]);
		return arr[topOfStack];
	}
	
	public void deleteStack() {
		arr = null;
		System.out.println("The stack is deleted successfully");
	}
	
	public void traversalStack() {
		if (isEmpty()) {
			System.out.println("The stack is empty!!");
			return;
		}
		for (int i = topOfStack; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
