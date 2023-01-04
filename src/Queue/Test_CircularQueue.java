package Queue;

public class Test_CircularQueue {

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		cq.enQueue(10);
		cq.enQueue(20);
		cq.enQueue(30);
		cq.enQueue(40);
		
		System.out.println(cq.isFull());
		System.out.println(cq.isEmpty());
		
		int result = cq.deQueue();
		System.out.println(result);
		System.out.println(cq.deQueue());
		System.out.println(cq.peek());
		
		

	}

}
