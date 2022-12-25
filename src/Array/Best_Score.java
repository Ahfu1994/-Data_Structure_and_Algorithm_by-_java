package Array;

import java.util.Arrays;

public class Best_Score {

	public static void main(String[] args) {
		int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		System.out.println(firstSecond(myArray));

	}
	public static String firstSecond(int[] myArray) {
	     Arrays.sort(myArray);
	     return String.valueOf(myArray[myArray.length-1])+" "+String.valueOf(myArray[myArray.length-2]);
	}

}
