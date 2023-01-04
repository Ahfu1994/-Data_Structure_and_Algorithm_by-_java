package Queue;

public class QueueArray {
	int[] arr;
	int topOfQueue;
	int beginnigOfQueue;
	
	public QueueArray(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginnigOfQueue = -1;
		System.out.println("The Queue is successfully created with size of "+size);
	}
	
	public boolean isFull() {
		if (topOfQueue == arr.length-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if (beginnigOfQueue == -1 || beginnigOfQueue == arr.length) {
			return true;
		}
		return false;
	}
	
	//Enqueue
	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("The Queue is full!!!");
		}
		else if (isEmpty()) {
			beginnigOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}
		else {
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}
	}
	
	//Dequeue
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("The Queue is empty!!!");
			return -1;
		}
		int result = arr[beginnigOfQueue];
		beginnigOfQueue++;
		if (beginnigOfQueue > topOfQueue) {
			beginnigOfQueue = topOfQueue = -1;
		}
		return result;
	}
	
	//peek
	public int peek() {
		if (isEmpty()) {
			System.out.println("The Queue is empty!!!");
			return -1;
		}
		return arr[beginnigOfQueue];
	}
	
	public void deleteQueue() {
		arr = null;
		System.out.println("The Queue deleted successfully");
	}

}
