package Stack_Queue_Problems;

public class Test_StackMin {

	public static void main(String[] args) {
		StackMin newStack = new StackMin();
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.push(1);
		newStack.push(0);
		System.out.println(newStack.min());
		newStack.pop();
		System.out.println(newStack.min());
		
		

	}

}
