package Queue;

public class Test_QueueLinkedList {

	public static void main(String[] args) {
		LinkedListQueue lq = new LinkedListQueue();
		lq.enQueue(1);
		lq.enQueue(2);
		lq.enQueue(3);
		lq.enQueue(4);
		lq.enQueue(5);
		lq.enQueue(6);
		
		boolean result = lq.isEmpty();
		System.out.println(result);
		
		System.out.println(lq.deQueue());
		System.out.println(lq.peek());
		

	}

}
