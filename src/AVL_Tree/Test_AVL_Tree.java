package AVL_Tree;

public class Test_AVL_Tree {

	public static void main(String[] args) {
		AVL avlTree = new AVL();
		avlTree.insert(5);
		avlTree.insert(10);
		avlTree.insert(15);
		avlTree.insert(20);
//		avlTree.levelOrder();
		avlTree.delete(10);
		avlTree.levelOrder();
	}

}
