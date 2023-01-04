package Queue;

public class Test_QueueArray {

	public static void main(String[] args) {
		QueueArray newQ = new QueueArray(5);
//		System.out.println(newQ.isFull());
//		System.out.println(newQ.isEmpty());
		newQ.enQueue(1);
		newQ.enQueue(2);
		newQ.enQueue(3);
		newQ.enQueue(4);
		newQ.enQueue(5);

//		int result = newQ.deQueue();
//		System.out.println(result);
//		int result1 = newQ.deQueue();
//		System.out.println(result1);
		
		int result2 = newQ.deQueue();
		System.out.println(result2);
		
		newQ.deleteQueue();
		
		
	}

}
