package Big_O_Notation;

import java.util.Arrays;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{12,33,44,55,66,77,88,99,100, 10,12,13,43};
		
		System.out.println(Arrays.toString(arr));
		
		reverseArray(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static void reverseArray(int[] arr, int left, int right) {
		if(left >= right) {
			return ;
		}
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
		reverseArray(arr, left+1,right-1);		
	}

}
