package Stack;

public class Test_StackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray st = new StackArray(10);
		
		System.out.println(st.isEmpty());
		
		System.out.println(st.isFull());
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(20);
		st.push(30);
		
//		st.pop();
		
		st.peek();
		
		st.traversalStack();
		
		st.deleteStack();
		
	}

}
