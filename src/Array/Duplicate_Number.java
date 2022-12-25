package Array;

import java.util.Arrays;

public class Duplicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {1, 1, 2, 2, 3, 4, 5};
		System.out.println(Arrays.toString(removeDuplicates(myArr)));
		

	}
	
	private static int removeDuplicates(int[] arr, int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		return j;
	}
	
	public static int[] removeDuplicates(int[] arr) {
		int result = removeDuplicates(arr, arr.length);
		int[] newArr = new int[result];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
}
