package Array;

public class TwoDimensionArray {
	int[][] arr2D = null;
	
	public TwoDimensionArray(int row, int col) {
		arr2D = new int[row][col];
		
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[0].length; j++) {
				arr2D[i][j] = Integer.MIN_VALUE;
			}
		}
	}
	
	//default value
	public void print2DArray() {
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[0].length; j++) {
				System.out.print(arr2D[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//insert method
	public void insert2DArray(int row, int col, int value) {
		try {
			if (arr2D[row][col] == Integer.MIN_VALUE) {
				arr2D[row][col] = value;
				System.out.println("Successfully inserted");
			}
			else {
				System.out.println("This cell is already occupied");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array!!!");
		}
	}
	
	//search method
	public void searchInArray(int valuetoSearch) {
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[0].length; j++) {
				if (arr2D[i][j] == valuetoSearch) {
					System.out.println("The value is found at the index of "+"["+i+"]["+j+"]");
					return ;
				}
			}
		}	
		System.out.println(valuetoSearch + " is not found");
	}
		
		
	//deleting method
	public void deleteValue(int row_value, int col_value) {
		try {
			System.out.println("The value has been deleted successfully "+arr2D[row_value][col_value]);
			arr2D[row_value][col_value] = Integer.MIN_VALUE;
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("the value that is provided in not in the range of array");
		}
	}

	public static void main(String[] args) {
		
		TwoDimensionArray arr = new TwoDimensionArray(3, 3);
		arr.insert2DArray(0, 0, 100);
		arr.insert2DArray(0, 1, 300);
		arr.insert2DArray(0, 2, 400);
		arr.insert2DArray(1, 1, 200);
		arr.print2DArray();
		arr.searchInArray(200);
		arr.print2DArray();
		arr.searchInArray(500);
		arr.deleteValue(1, 1);
		arr.print2DArray();
		
		
	}

}
