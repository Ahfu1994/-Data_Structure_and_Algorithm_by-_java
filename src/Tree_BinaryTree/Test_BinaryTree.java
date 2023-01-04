package Tree_BinaryTree;

public class Test_BinaryTree {

	public static void main(String[] args) {
		BinaryTreeLL bTree = new BinaryTreeLL();
		
		bTree.insert("N1");
		bTree.insert("N2");
		bTree.insert("N3");
		bTree.insert("N4");
		bTree.insert("N5");
		bTree.insert("N6");
		bTree.insert("N7");
		bTree.insert("N10");
		bTree.insert("N11");
		
//		System.out.println(bTree.getDeepestNode().value);
		
		bTree.levelOrder();
		bTree.deleteNode("N4");
		bTree.levelOrder();
		
		bTree.deleteBT();
		bTree.levelOrder();
		
		
		
		
//		System.out.print("preorder : ");
//		bTree.preOrder(bTree.root);
//		System.out.println();
//		System.out.print("inorder : ");
//		bTree.inOrder(bTree.root);
//		System.out.println();
//		System.out.print("postorder : ");
//		bTree.postOrder(bTree.root);
//		System.out.println();
//		System.out.print("levelorder : ");
//		bTree.levelOrder();
//		System.out.println();
//		bTree.search("N10");
		
//		bTree.insert("N10");
//		bTree.levelOrder();
//		System.out.println();
//		
//		System.out.println(bTree.getDeepestNode().value);
//		
//		System.out.println();
//		bTree.deleteDeepestNode();
//		bTree.levelOrder();
//		
//		System.out.println();
//		System.out.println(bTree.getDeepestNode().value);
//		
//		System.out.println();
//		bTree.deleteDeepestNode();
//		bTree.levelOrder();
		
		
		

	}

}
