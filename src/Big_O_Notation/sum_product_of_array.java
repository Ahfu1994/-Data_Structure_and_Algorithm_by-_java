package Big_O_Notation;

public class sum_product_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{12,33,44,55,66,77,88,99,100, 10,12,13,43};
		
		int start = (int)System.currentTimeMillis();
		System.out.println(sumArray(arr,arr.length));
		int stop = (int)System.currentTimeMillis();
		int sum_time = stop-start;
		System.out.println(sum_time);
		
		start = (int)System.currentTimeMillis();
		System.out.println(productArray(arr,arr.length));
		stop = (int)System.currentTimeMillis();
		sum_time = stop-start;
		System.out.println(sum_time);
		
	}
	
	public static int sumArray(int[] arr , int length) {
		if(length == 0) {
			return arr[length];
		}
		return arr[length-1] + sumArray(arr ,length-1);
	}
	
	public static int productArray(int[] arr, int length) {
		if(length == 0) {
			return arr[length];
		}
		return arr[length-1] * productArray(arr ,length-1);
	}

}
