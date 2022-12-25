package Array;

import java.util.Arrays;

public class findMidle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1, 2, 3};
		System.out.println(Arrays.toString(middle(myArray)));

	}
	
	public static int[] middle(int[] arr) {
		return Arrays.copyOfRange(arr, 1, arr.length-1);
	}

}
