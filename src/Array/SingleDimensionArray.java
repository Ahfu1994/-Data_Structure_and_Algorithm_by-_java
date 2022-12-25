package Array;

public class SingleDimensionArray {
	
	int arr[] = null;

	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	//insert method
	public void insert(int location, int valueToBeInserted) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				
				System.out.println("Successfully inserted");
			}
			else {
				System.out.println("This cell is already occupied");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index to access array!!!");
		}
		
	}
	
	//traverse method
	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			
		} catch (Exception e) {
			System.out.println("Array no longer exists");
		}
		
	}
	
	//search method
	public void searchInArray(int valuetoSearch) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valuetoSearch) {
				System.out.println("The value is found at the index of "+i);
				return ;
			}
		}
		System.out.println(valuetoSearch + " is not found");
	}
	
	//deleting method
	public void deleteValue(int valueToDeleteIndex) {
		try {
			arr[valueToDeleteIndex] = Integer.MIN_VALUE;
			System.out.println("The value has been deleted successfully");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("the value that is provided in not in the range of array");
		}
	}
	
	//main method
	public static void main(String[]arg) {
		SingleDimensionArray sda = new SingleDimensionArray(5);
		sda.insert(0, 10);
		sda.insert(2, 20);
		sda.insert(3, 30);
		sda.insert(3, 40);
		sda.insert(4, 100);
		
		var firstElement  = sda.arr[0];
		System.out.println(firstElement);
		
		System.out.println("Array traversal");
		
//		sda.traverseArray();
		
		sda.searchInArray(100);
		
		sda.deleteValue(6);
		
		
	}

}
