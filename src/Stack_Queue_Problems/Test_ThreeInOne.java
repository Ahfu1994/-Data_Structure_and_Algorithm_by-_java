package Stack_Queue_Problems;

public class Test_ThreeInOne {

	public static void main(String[] args) {
		ThreeInOne newStrack = new ThreeInOne(3);
		newStrack.push(0, 1);
		newStrack.push(0, 2);
		newStrack.push(0, 3);
		
		newStrack.push(1, 4);
		newStrack.push(1, 5);
		newStrack.push(1, 6);
		
		newStrack.push(2, 10);
		newStrack.push(2, 20);

		boolean  result = newStrack.isFull(2);
		System.out.println(result);
	}

}
