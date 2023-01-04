package Tree_BinaryTree;

public class Test_BinaryTreeArray {

	public static void main(String[] args) {
		BinaryTreeArray bt = new BinaryTreeArray(9);
		bt.insert("N1");
		bt.insert("N2");
		bt.insert("N3");
		bt.insert("N4");
		bt.insert("N5");
		bt.insert("N6");
		bt.insert("N7");
		bt.insert("N8");
		bt.insert("N9");
		
		bt.preOrder(1);
		System.out.println();
		bt.inOrder(1);
		System.out.println();
		bt.postOrder(1);
		System.out.println();
		bt.levelOrder(1);
		
		System.out.println(bt.search("N1"));
		
		System.out.println();
		bt.deleteNode("N7");
		bt.levelOrder(1);
		
		bt.deleteBinaryTree();
		bt.deleteBinaryTree();
//		bt.levelOrder(1);
		
		
		

	}

}
