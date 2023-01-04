package Binary_Search_Tree;

public class Test_BinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree newBST = new BinarySearchTree();
		newBST.insert(70);
		newBST.insert(50);
		newBST.insert(90);
		newBST.insert(30);
		newBST.insert(60);
		newBST.insert(80);
		newBST.insert(100);
		newBST.insert(20);
		newBST.insert(40);
		
//		newBST.preOrder(newBST.root);
//		System.out.println();
//		newBST.inOrder(newBST.root);
//		System.out.println();
//		newBST.postOrder(newBST.root);
//		System.out.println();
//		newBST.levelOrder();
		
//		newBST.search(newBST.root, 50);
		newBST.levelOrder();
		newBST.deleteNode(newBST.root, 90);
		System.out.println();
		newBST.levelOrder();
		newBST.deleteBST();

	}

}
