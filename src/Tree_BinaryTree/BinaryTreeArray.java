package Tree_BinaryTree;

import java.util.Iterator;

public class BinaryTreeArray {
	String[] arr;
	int lastUsedIndex;

	public BinaryTreeArray(int size) {
		arr = new String[size + 1];
		this.lastUsedIndex = 0;
		System.out.println("Blank Tree of size " + size + " has been created");
	}

	public boolean isFull() {
		if (arr.length - 1 == lastUsedIndex) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(String value) {
		if (!isFull()) {
			arr[lastUsedIndex + 1] = value;
			lastUsedIndex++;
			System.out.println("The value of " + value + " has been inserted");
		} else {
			System.out.println("The BT is full");
		}
	}

	// preorder method
	public void preOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		System.out.print(arr[index] + " ");
		preOrder(index * 2);
		preOrder(index * 2 + 1);
	}

	// inorder method
	public void inOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}

		inOrder(index * 2);
		System.out.print(arr[index] + " ");
		inOrder(index * 2 + 1);
	}

	// postorder method
	public void postOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		postOrder(index * 2);
		postOrder(index * 2 + 1);
		System.out.print(arr[index] + " ");
	}

	// levelorder method
	public void levelOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		System.out.print(arr[index] + " ");
		levelOrder(index + 1);

	}

	// search method
	public int search(String value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("The value " + value + " is exists at the location " + i);
				return i;
			}

		}
		System.out.println("The value does not exist in BinaryTree");
		return -1;
	}
	
	//delete node method
	public void deleteNode(String value) {
		int location = search(value);
		if (location == -1) {
			return;
		}
		arr[location] = arr[lastUsedIndex];
		lastUsedIndex--;
		System.out.println("The node successfully deleted");
		
	}
	
	public void deleteBinaryTree() {
		try {
			arr = null;
			System.out.println("The binary has been successfully deleted");
		} catch (Exception e) {
			System.out.println("The binary deleted");
		}
		
	}

}
