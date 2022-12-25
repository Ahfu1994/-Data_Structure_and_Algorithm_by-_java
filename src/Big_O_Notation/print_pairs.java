package Big_O_Notation;

public class print_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,5,6};
		printPairs(arr);

	}
	
	public static void printPairs(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i]+""+arr[j]+" ");
			}
			System.out.println();
		}
	}

}
