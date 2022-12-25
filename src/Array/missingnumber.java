package Array;

public class missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int missingNumber(int[] arr, int totalCount) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 +=arr[i];
		}
		
		for (int i = 0; i < totalCount; i++) {
			sum2 +=arr[i];
		}
		int dif = sum2-sum1;
		
		return dif;
	}

}
