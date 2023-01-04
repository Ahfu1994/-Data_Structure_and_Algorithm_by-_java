package Binary_Heap;

public class Test_BinaryHeap {

	public static void main(String[] args) {
		BinaryHeap newBP = new BinaryHeap(5);
//		newBP.peek();
//		newBP.isEmpty();
		newBP.insert(10, "Max");
		newBP.insert(5, "Max");
		newBP.insert(15, "Max");
		newBP.insert(1, "Max");
		newBP.levelOrder();
		
		newBP.extractHeapOfBP("Max");
		newBP.levelOrder();
		newBP.deleteBinaryHeap();
		
	}

}
