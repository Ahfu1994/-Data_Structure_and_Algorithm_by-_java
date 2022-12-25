package Array;

public class Pairs2 {

	public static void main(String[] args) {
		int[] arr = new int[]{2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		System.out.println(pairs(arr,7));

	}
	
	public static String pairs(int[] myArray, int sum) {
		String result = "";
		for (int i = 0; i < myArray.length; i++) {
			for (int j = i+1; j < myArray.length; j++) {
				if (myArray[i]+myArray[j] == sum) {
					result += myArray[i]+":"+myArray[j]+" ";
				}
			}
		}
		return result;
	}

}
