package Queue;

public class CircularQueue {
	int[] arr;
	int topOfQueue;
	int beginningOfQueue;
	int size;
	
	public CircularQueue(int size) {
		this.arr = new int[size];
		this.size = size;
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("The Circular Queue is successfully created with size of "+size);
	}
	
	//check queue is empty
	public boolean isEmpty() {
		if (topOfQueue == -1 ) {
			return true;
		}
		return false;
	}
	
	//check circular queue is full
	public boolean isFull() {
		if (topOfQueue+1 == beginningOfQueue) {
			return true;
		}
		else if (beginningOfQueue == 0 && topOfQueue+1 == size) {
			return true;
		}
		return false;
	}
	
	//enQueue
	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("The Circular Queue is full!!!");
			return;
		}
		else if (isEmpty()) {
			beginningOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted "+ value +" in the queue.");
		}
		else {
			if (topOfQueue+1 == size) {
				topOfQueue = 0;
			}
			else {
				topOfQueue++;
			}
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted "+ value +" in the queue.");
		}
		
	}
	
	//deQueue 
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("The Circular is empty!!!");
			return -1;
		}
		else {
			int result = arr[beginningOfQueue];
			arr[beginningOfQueue] = 0;
			if (beginningOfQueue == topOfQueue) {
				beginningOfQueue = topOfQueue = -1;
			}
			else if (beginningOfQueue+1 == size) {
				beginningOfQueue = 0;
			}
			else {
				beginningOfQueue++;
			}
			return result;
			
		}
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("The Circular is empty!!!");
			return -1;
		}
		return arr[beginningOfQueue];
	}
	
	public void deleteCircular() {
		arr = null;
		System.out.println("The Circular deleted successfully");
	}
}
